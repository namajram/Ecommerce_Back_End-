package com.api.beans;

import org.springframework.stereotype.Component;



@Component
public class Login {
	private long id;
	private String username;
	private String password;
	
	public Login() {
		
	}
	public Login(String usernamelogin, String passwordlogin) {
		super();
		this.username = usernamelogin;
		this.password = passwordlogin;
	}
	public String getUsernamelogin() {
		return username;
	}
	public String getPasswordlogin() {
		return password;
	}
	

}
