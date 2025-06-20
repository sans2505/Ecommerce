package com.ecommerce.dto;
//only shares necessary details  not the whole class entity object
import com.ecommerce.entity.Role;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {

	private String token;
	private UserDTO user;
	private Role role;
}
