package com.rootstechnology.spring.finances.configuration;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class WelcomeConfiguration {
    
    @Bean
    @Scope(value="request", proxyMode=ScopedProxyMode.TARGET_CLASS)
    public MyLocalDateTime filetimeStamp() {
        return new MyLocalDateTime(LocalDateTime.now());
    }
}
