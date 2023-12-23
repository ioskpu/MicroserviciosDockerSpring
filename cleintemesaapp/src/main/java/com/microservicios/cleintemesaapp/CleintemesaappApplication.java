package com.microservicios.cleintemesaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@FeignClient
public class CleintemesaappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleintemesaappApplication.class, args);
	}

}
