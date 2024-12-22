package com.demo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.app.dto.ApiResponse;
import com.demo.app.dto.UserDTO;
import com.demo.app.entities.User;
import com.demo.app.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public ApiResponse registerUser(UserDTO userDTO) {
		User user = new User();

		user.setId(userDTO.getId());
		user.setUsername(userDTO.getUsername());
		user.setEmail(userDTO.getEmail());
		user.setPassword(userDTO.getPassword());
		user.setRole(userDTO.getRole());

		User newUser = userRepository.save(user);

		System.out.println(newUser.getEmail());
		return new ApiResponse("User added successfully with id :" + newUser.getId());
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
