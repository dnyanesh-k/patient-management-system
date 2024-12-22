package com.demo.app.service;

import com.demo.app.dto.ApiResponse;
import com.demo.app.dto.UserDTO;

public interface UserService {
	public ApiResponse registerUser(UserDTO userDTO);

	public Object getAllUsers();
}
