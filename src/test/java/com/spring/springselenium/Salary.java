package com.spring.springselenium;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {



    private int amount;

    @Value("${amount}")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }
}
