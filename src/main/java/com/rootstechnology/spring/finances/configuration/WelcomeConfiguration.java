package com.rootstechnology.spring.finances.configuration;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class WelcomeConfiguration {

    @Bean
    @Scope(value="request")
    public LocalDateTime filetimeStamp() {
        return LocalDateTime.now();
    }
}
