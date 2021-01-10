package com.example.demo.utility;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 *   Success Response Object Definition. 
 *   @author Puneet Arora
 *   created on 10/01/2020
 */

@Getter
@Setter
@Component
public class SuccessResponse {

	String status;
	int identifier;
	String message;
	
}
