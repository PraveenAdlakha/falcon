package org.apache.falcon.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * Created by praveen on 4/2/16.
 */
public class MetricsMonitoringService {
    private static final Logger LOG = LoggerFactory.getLogger("MetricsMonitoring");

    private static boolean isEnabled = false;
    Properties origProps = new Properties();

    /**
     * Initialize the metrics instrumentation service.
     *
     * @param services services instance.
     * @throws org.apache.oozie.service.ServiceException
     */
//    @Override
//    public void init(Services services)  {
//
//        isEnabled = true;
//    }
//
//    /**
//     * Destroy the metrics instrumentation service.
//     */
//    @Override
//    public void destroy() {
//        isEnabled = false;
//
//    }

    /**
     * Returns if the MetricsInstrumentationService is enabled or not.
     *
     * @return true if the MetricsInstrumentationService is enabled; false if not
     */
    public static boolean isEnabled() {
        return isEnabled;
    }
}
