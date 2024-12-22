package com.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.dto.UserDTO;
import com.demo.app.service.UserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<?> registerUser(@RequestBody @Valid UserDTO user){
		System.out.println(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.registerUser(user));
	}
	
}
