package com.pluralsight.springboot.events;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class EventsConfiguration {
    @Bean
    public WebClient webClient(@Value("${tickets.events.url}") String baseUrl){
        return WebClient.builder().baseUrl(baseUrl).build();
    }
}
