package com.tianjian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuul9521Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuul9521Application.class, args);
	}

}
