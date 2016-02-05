package org.apache.falcon.job;

import com.codahale.metrics.*;
import com.codahale.metrics.graphite.Graphite;
import com.codahale.metrics.graphite.GraphiteReporter;
import com.google.common.collect.Maps;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by praveen on 4/2/16.
 */
public class MetricsRegistrar {

    private static final Logger logger = LoggerFactory.getLogger(MetricsRegistrar.class.getName());
    public final MetricRegistry metrics = new MetricRegistry();
    public static MetricsRegistrar registrar = new MetricsRegistrar();
    private static AtomicBoolean graphiteInitialized = new AtomicBoolean(false);
    protected Map<String, GaugeBean> gaugeMap;
    protected Map<String, Counter> counterMap;
    protected Map<String, Timer> timerMap;
    private GraphiteReporter graphiteReporter;

    private MetricsRegistrar() {
        gaugeMap = Maps.newConcurrentMap();
    }

    public static synchronized GaugeBean registerGauge(final String prefix, String topicName, String source, final Queue queue) {
        String metricName = createMetricName(prefix, source, topicName);
        GaugeBean bean = registrar.gaugeMap.get(metricName);
        if (null == bean) {
            try {
                bean = MetricsRegistrar.createQueueDepth(metricName, registrar.metrics, queue);
                logger.debug(String.format("Registering GaugeBean [%s]", metricName));
                registrar.gaugeMap.put(metricName, bean);
            } catch (Exception ignore) {
            }
        }
        return bean;
    }

    public static String createMetricName(final String prefix, final String source, final String topicName) {
        //Be carefull when ever you change this magic combination !!
        String metricName;
        if (null == prefix) {
            metricName = String.format("%s.%s", source, topicName);
        } else {
            metricName = String.format("%s.%s.%s", source, prefix, topicName);
        }
        return metricName;
    }

    public static GaugeBean createQueueDepth(final String metricName, final MetricRegistry registry, final Queue queue) {
        final Gauge<Integer> queueGauge = new Gauge<Integer>() {
            @Override
            public Integer getValue() {
                return queue.size();
            }
        };
        registry.register(String.format("%s.depth.count", metricName), queueGauge);
        return new GaugeBean(queueGauge);
    }

    @Getter
    public static class GaugeBean {
        @Accessors(fluent = true)
        private Gauge<Integer> queue;

        public GaugeBean(Gauge<Integer> queueGauge) {
            this.queue = queueGauge;
        }
    }


    public MetricsRegistrar initGraphite(boolean includeHost, String graphiteHost,
                                         Integer graphitePort,
                                         Integer graphiteRefresh,
                                         String prefix,
                                         String colo) {
        if (null != graphiteReporter) {
            return this;
        }
        try {
            String prefixFormat;
            if (includeHost) {
                String host = InetAddress.getLocalHost().getHostName().toLowerCase().split("\\.")[0];
                prefixFormat = String.format("prod.%s.%s.%s", colo, prefix, host);
            } else {
                prefixFormat = String.format("prod.%s.%s", colo, prefix);
            }

            if (null != graphiteHost) {
                logger.info("graphite prefix = " + prefixFormat);
                final InetSocketAddress address = new InetSocketAddress(graphiteHost, graphitePort);
                graphiteReporter = GraphiteReporter.forRegistry(metrics)
                        .prefixedWith(prefixFormat)
                        .build(new Graphite(address));
                graphiteReporter.start(graphiteRefresh, TimeUnit.SECONDS);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return this;
    }

   

//    public static synchronized MetricsRegistrar start(Properties config) throws Exception {
//        //TODO we need to have flags per topic, right now it is singleton !
//
//        logger.info("Stats enabled = " + config.getProperty(STATS_ENABLE.D3.value()));
//        if (Boolean.valueOf(config.getProperty(STATS_ENABLE.D3.value()))) {
//            if (!graphiteInitialized.get()) {
//                boolean includeHost = Boolean.valueOf(config.getProperty(INCLUDE_HOST_PREFIX.D3.value(), INCLUDE_HOST_PREFIX.DEFAULT_VALUE.value()));
//                registrar.initGraphite(
//                        includeHost,
//                        config.getProperty(STATS_URL.D3.value()),
//                        Integer.parseInt(config.getProperty(STATS_URL_PORT.D3.value())),
//                        Integer.parseInt(config.getProperty(STATS_POLL_INTERVAL.D3.value(), STATS_POLL_INTERVAL.DEFAULT_VALUE.value())),
//                        config.getProperty(STATS_PREFIX.D3.value()), config.getProperty(COLO.D3.value()));
//                graphiteInitialized.getAndSet(true);
//            }
//        }
//
//        if (Boolean.valueOf(config.getProperty(AUDIT_ENABLE.D3.value()))) {
//            if (!auditInitialized.get()) {
//                Properties prop = (Properties) config.clone();
//                registrar.initAudit(prop);
//                auditInitialized.getAndSet(true);
//            }
//        }
//
//        return registrar;
//    }

}
