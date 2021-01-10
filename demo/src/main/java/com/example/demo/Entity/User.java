package com.example.demo.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *   User Entity. Object representation for User table in database 
 *   @author Puneet Arora
 *   created on 10/01/2020
 */

@Entity
@Table(name="user")
@Getter
@Setter
@ToString
public class User implements Serializable {

	@Id                         
	private int id;                 // Primary key in user table
	
	@Column(name="name")
	private String name;
	
	@Column(name="identifier")      
	private int identifier;         // number to be incremented in API hit 
	
}
