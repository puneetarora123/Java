package com.example.demo.utility;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *   Error Response Object Definition. 
 *   @author Puneet Arora
 *   created on 10/01/2020
 */

@Component
@Getter
@Setter
@ToString
public class ErrorResponse implements Serializable{

	private String code;
	private String message;
}
