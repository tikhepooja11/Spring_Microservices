package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class CitizenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitizenServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced //it is applied to add citizen-service name instead of localhost:9002 means t remove this hardcode as port can be canged
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
