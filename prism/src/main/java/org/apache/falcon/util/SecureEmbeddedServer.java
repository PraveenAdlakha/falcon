/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.falcon.util;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.HttpConfiguration;
import org.eclipse.jetty.server.SecureRequestCustomizer;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.server.SslConnectionFactory;
import org.eclipse.jetty.server.HttpConnectionFactory;


import java.util.Properties;

/**
 * This is a jetty server which requires client auth via certificates.
 */
public class SecureEmbeddedServer extends EmbeddedServer {

    public SecureEmbeddedServer(int port, String path) {
        super(port, path);
    }

    protected Connector getConnector(int port) {
        Properties properties = StartupProperties.get();
        SslContextFactory sslContextFactory = new SslContextFactory();
        sslContextFactory.setKeyStorePath(properties.getProperty("keystore.file",
                System.getProperty("keystore.file", "conf/prism.keystore")));
        sslContextFactory.setKeyStorePassword(properties.getProperty("keystore.password",
                System.getProperty("keystore.password", "falcon-prism-passwd")));
        sslContextFactory.setTrustStore(properties.getProperty("truststore.file",
                System.getProperty("truststore.file", "conf/prism.keystore")));
        sslContextFactory.setTrustStorePassword(properties.getProperty("truststore.password",
                System.getProperty("truststore.password", "falcon-prism-passwd")));


        sslContextFactory.setKeyManagerPassword(properties.getProperty("password",
                System.getProperty("password", "falcon-prism-passwd")));
        sslContextFactory.setWantClientAuth(true);

        HttpConfiguration http_config = new HttpConfiguration();
        http_config.setSecureScheme("https");
//        http_config.setSecurePort(8443);
        http_config.setOutputBufferSize(32768);
        final Integer bufferSize = Integer.valueOf(StartupProperties.get().getProperty(
                "falcon.jetty.request.buffer.size", "16192"));
        http_config.setResponseHeaderSize(bufferSize);
        http_config.setRequestHeaderSize(bufferSize);

        HttpConfiguration https_config = new HttpConfiguration(http_config);
        https_config.addCustomizer(new SecureRequestCustomizer());

        ServerConnector connector = new ServerConnector(server,new SslConnectionFactory(sslContextFactory,"http/1.1"),
                new HttpConnectionFactory(https_config));
        connector.setPort(port);



//        SslSocketConnector connector = new SslSocketConnector();
//        connector.setPort(port);
//        connector.setHost("0.0.0.0");
//        connector.setKeystore(properties.getProperty("keystore.file",
//                System.getProperty("keystore.file", "conf/prism.keystore")));
//        connector.setKeyPassword(properties.getProperty("keystore.password",
//                System.getProperty("keystore.password", "falcon-prism-passwd")));
//        connector.setTruststore(properties.getProperty("truststore.file",
//                System.getProperty("truststore.file", "conf/prism.keystore")));
//        connector.setTrustPassword(properties.getProperty("truststore.password",
//                System.getProperty("truststore.password", "falcon-prism-passwd")));
//        connector.setPassword(properties.getProperty("password",
//                System.getProperty("password", "falcon-prism-passwd")));
//        connector.setWantClientAuth(true);

        // this is to enable large header sizes when Kerberos is enabled with AD
//
//        connector.setHeaderBufferSize(bufferSize);
//        connector.setRequestBufferSize(bufferSize);

        return connector;
    }
}
