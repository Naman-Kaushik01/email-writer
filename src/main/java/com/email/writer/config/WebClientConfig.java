package com.email.writer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                // OPTIONAL: use only if calling one main API
                // .baseUrl("https://api.example.com")
                .build();
    }
}
