package com.doppel.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerService {

	public static void main(String[] args) {
		SpringApplication.run(CustomerService.class, args);
	}

}
