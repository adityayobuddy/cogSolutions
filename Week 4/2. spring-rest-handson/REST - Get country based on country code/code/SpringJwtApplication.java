package com.cognizant.springJWT;

import com.cognizant.springJWT.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringJwtApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringJwtApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApplication.class, args);

	}


}
