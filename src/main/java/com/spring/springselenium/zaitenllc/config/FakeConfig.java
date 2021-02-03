package com.spring.springselenium.zaitenllc.config;

import com.github.javafaker.Faker;
import com.spring.springselenium.zaitenllc.anotation.LazyConfig;
import org.springframework.context.annotation.Bean;

@LazyConfig
public class FakeConfig {
    @Bean
    public Faker faker() {
        return new Faker();
    }
}
