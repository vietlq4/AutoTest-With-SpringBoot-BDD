package com.spring.springselenium;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringSeleniumApplicationTests {
	@Autowired
	private User user;

    @Value("${fruits}")
	private List<String> fruits;

    @Value("${DEFAULT_VALUE:default value}")
	private String defaultValue;


	@Test
	void contextLoads() {
		//System.out.println(this.defaultValue);
        //this.user.printDetails();
		Faker faker = new Faker();
		System.out.println(faker.name().firstName());
	}


//	Address address = new Address();
//	Salary salary = new Salary();
//	User user= new User(address,salary);
//		user.printDetails();
}
