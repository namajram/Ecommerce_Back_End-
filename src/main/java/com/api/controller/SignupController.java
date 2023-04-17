package com.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.beans.Signup;

import com.api.repository.SignupRepository;



@RestController
public class SignupController {
	@Autowired
	SignupRepository sr;
	
	@GetMapping("/signup")
	public  List<Signup> getSignup() {
		return sr.findAll();
		
	}
	
	@GetMapping("/signup/{email}")
	public Signup getSignup(@PathVariable String email){
		Optional<Signup> user = sr.findById(email);
		if (user.isEmpty()) {
			throw new RuntimeException("(Id is not have");
			
		}
		return user.get();
	}
	
	@PostMapping("/signup")
	public ResponseEntity postSignup(@RequestBody Signup n) {
		String email = n.getEmail();
		Signup findByEmail = sr.findByEmail(email);
		if (findByEmail == null) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(sr.save(n));
		}else{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email already exist");
		}
	}
}