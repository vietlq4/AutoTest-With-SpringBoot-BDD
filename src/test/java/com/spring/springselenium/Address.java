package com.spring.springselenium;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${street:default value}")
    private String street ;


    public String getStreet(){
        return street;
    }
}
