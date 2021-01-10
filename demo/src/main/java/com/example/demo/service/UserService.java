package com.example.demo.service;

//import java.util.concurrent.CompletableFuture;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.dao.UserDAO;

/**
 *   User Service class. Main logic handles here. 
 *   @author Puneet Arora
 *   created on 10/01/2020
 */

@Service
public class UserService {	
	
	User user;
	@Autowired
	UserDAO userDao;                               // reference variable for UserDAO class
	
	//Logger logger=Logger.getLogger(UserService.class);
	
	// synchronized keyword for thread safety because update opeation is used 
	public synchronized int fun() throws Exception{   
			
	user=userDao.getUserWithID(1);		          // get user object having id =1
	int ident=user.getIdentifier()+1;             // get identifier for this user and increase by 1 
	user.setIdentifier(ident);  				  // update new identifier value for user object 
	userDao.updateUser(user);                	  // update user in database.	 
	return ident;
	}	
}
