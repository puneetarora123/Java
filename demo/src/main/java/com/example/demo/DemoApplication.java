package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *   API to increase the number (value of identifier) in db in each request.
 *   @author Puneet Arora
 *   created on 10/01/2020
 * 
 */

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
