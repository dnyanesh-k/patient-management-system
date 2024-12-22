package com.demo.app.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{
	
	@Column(nullable = false,unique = true,length = 15)
	private String username;
	
	@Column(nullable = false,unique = true,length = 15)
	private String password;
	
	@Column(nullable = false,unique = true,length = 15)
	private String email;
	
	@Column
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	private Patient patient;
	
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	private Doctor doctor; 
	
}
