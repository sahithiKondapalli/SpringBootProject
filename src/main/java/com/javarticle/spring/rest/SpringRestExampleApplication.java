package com.javarticle.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringRestExampleApplication {
    
	public static void main(String[] args) {
		System.out.println("inside main");
		ApplicationContext context = SpringApplication.run(SpringRestExampleApplication.class, args);
	}
	
	@Bean
    public RestTemplate geRestTemplate() {
        return new RestTemplate();
    }
}
