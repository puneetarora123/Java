package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.service.UserService;
import com.example.demo.utility.ErrorResponse;
import com.example.demo.utility.SuccessResponse;


/**
 *   @author Puneet Arora
 *   created on 10/01/2020
 */

@Controller
@RequestMapping("/userOperation")
@CrossOrigin("*")
public class UserController {
		
	@Autowired
	UserService userService;
	
	@Autowired 
	ErrorResponse errorResponse;
	
	@Autowired
	SuccessResponse successResponse;
	
	@GetMapping("/increaseIdent")            // end point to perform increment operation for identifier value
	public ResponseEntity<Object> incrementId() throws Exception{
		
		successResponse.setStatus("success");
		successResponse.setMessage("Operation succeed. Identifier value incremented for id=1");
		successResponse.setIdentifier(userService.fun());
		
		return new ResponseEntity<Object>(successResponse,HttpStatus.OK);
	}
	
	// Handling Exceptional Cases 
	@ExceptionHandler(Exception.class)              
	public ResponseEntity<ErrorResponse> sqlExceptionHandler(Exception ex) {
		errorResponse.setCode("INTERNAL_SERVER_ERROR");
		errorResponse.setMessage(ex.getMessage());
	    return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
