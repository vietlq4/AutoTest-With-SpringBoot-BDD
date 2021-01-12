package com.spring.springselenium.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakeConfig {
    @Bean
    public Faker faker() {
        return new Faker();
    }
}
