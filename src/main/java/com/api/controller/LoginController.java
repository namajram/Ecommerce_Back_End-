package com.api.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.api.beans.Signup;

import com.api.repository.SignupRepository;

@RestController
public class LoginController {
	@Autowired
	SignupRepository lr;
	
	
	@GetMapping("/Login")
	public ResponseEntity getLogin(@RequestBody Signup n) {
		String usernamelogin = n.getUsername();
		String passwordlogin = n.getPassword();
	
		Signup findByUsername = lr.findByUsername(usernamelogin);
		Signup findByPassword = lr.findByPassword(passwordlogin);
		if (findByUsername != null && findByPassword != null && findByUsername.getId() == findByPassword.getId()) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(findByUsername);
		}		
		else{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username or password is incorrect");
		}
	}
}


