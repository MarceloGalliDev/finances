package com.rootstechnology.spring.finances.configuration;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntitiesConfiguration {

    @Bean(name="generateEntityId")
    public Long generateId() {
        var id = new Random();
        return id.nextLong(1, 1000);
    }
}
