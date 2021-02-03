package com.spring.springselenium.zaitenllc.anotation;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.lang.annotation.*;


@Configuration
@Lazy
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface LazyConfig {
}
