package com.demo.app.dto;

import com.demo.app.entities.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO extends BaseDTO{

	@NotNull
	private String username;
	
	@NotNull
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	@NotNull
	@JsonProperty(access = Access.WRITE_ONLY)
	private String confirmPassword;
	
	@Email
	@NotNull
	private String email;
	
	@NotNull
	private Role role;
	
}
