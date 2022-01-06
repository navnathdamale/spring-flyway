package com.spring.flyway.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "REGISTRATION_USERS")
public class User {
	@Id
	@GeneratedValue
	private int id;

	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
}
