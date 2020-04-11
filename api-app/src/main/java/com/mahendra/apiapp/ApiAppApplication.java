package com.mahendra.apiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAppApplication.class, args);
	}

}
