package com.springboot.ssl.springbootssl;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.embedded.TomcatWebServerFactoryCustomizer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.embedded.tomcat.ConfigurableTomcatWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.Ssl;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "server.ssl")
@Getter
@Setter
public class SslContainerFactory implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

    private String keystore;
    private String keyStorePassword;
    private String  protocol;
    private String[] ciphers;
    private String keyStoreType;
    private String keyAlias;

    @Override
    public void customize(TomcatServletWebServerFactory factory) {
        Ssl ssl = new Ssl();
        ssl.setCiphers(ciphers);
        ssl.setProtocol(protocol);
        ssl.setKeyAlias(keyAlias);
        ssl.setKeyStorePassword(keyStorePassword);
        ssl.setKeyStoreType(keyStoreType);
        ssl.setKeyStore(keystore);
        factory.setSsl(ssl);
    }

}
