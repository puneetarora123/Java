package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Entity.User;

/**
 *   User Repository interface. extends crudRepository to get easy access for crud operations implementations 
 *   @author Puneet Arora
 *   created on 10/01/2020
 */

public interface UserRepo extends CrudRepository<User,Integer> {

}
