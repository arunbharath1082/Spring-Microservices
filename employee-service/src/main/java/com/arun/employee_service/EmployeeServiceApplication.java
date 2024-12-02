package com.arun.employee_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
public class EmployeeServiceApplication {

	// Create a bean for WebClient
	// This bean is used to make calls to other services
	// This is a non-blocking, reactive client for performing HTTP requests
		@Bean
		public WebClient webclient(){
			return WebClient.builder().build();
		}



	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
