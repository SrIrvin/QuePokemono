package com.example.quepokemono.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Configuration class for defining application-wide beans.
 * This class is used to configure Spring-managed beans that can be injected into other components.
 */
@Configuration
public class AppConfig {

    /**
     * Creates and provides a {@link RestTemplate} bean.
     * <p>
     * The {@link RestTemplate} is a synchronous HTTP client for making API calls.
     * It can be used to send requests to external services and consume RESTful APIs.
     * </p>
     *
     * @return a new instance of {@link RestTemplate}
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}