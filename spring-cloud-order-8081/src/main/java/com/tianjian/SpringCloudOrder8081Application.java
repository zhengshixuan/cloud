package com.tianjian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class SpringCloudOrder8081Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOrder8081Application.class, args);
	}

}
