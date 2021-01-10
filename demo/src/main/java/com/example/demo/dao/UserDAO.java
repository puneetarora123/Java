package com.example.demo.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Entity.User;
import com.example.demo.repo.UserRepo;
import org.springframework.stereotype.Repository;

/**
 *   DAO class . Handles DB related operations.
 *   @author Puneet Arora
 *   created on 10/01/2020
 */

@Repository
public class UserDAO {

	@Autowired 
	UserRepo userRepository;
	
	public User getUserWithID(int id){
	Optional<User> user=userRepository.findById(id);
	if(user.isPresent()) {
		return user.get();
	}
	return null;
	}

	public void updateUser(User user) {
		userRepository.save(user);	
	}
}
