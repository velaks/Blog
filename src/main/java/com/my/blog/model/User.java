package com.my.blog.model;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	private int Id;
	
	@Column(nullable=false)
	@NotBlank(message="Name must be inserted")
	@Pattern(regexp = "^[\\p{L}0-9\\.+\\- ]+$")
	private String userName;
	
	@Column(nullable=false, unique=true)
	@NotBlank(message="Email must be insert")
	private String email;
	
	@Column(nullable=false)
	@NotBlank(message="Password must be insert")
	private String password;
	
	@Column(nullable=false)
	private boolean enabled;
	
	@Column(nullable=false)
	//how?
	private LocalDateTime registDate;
	
	
	

}
