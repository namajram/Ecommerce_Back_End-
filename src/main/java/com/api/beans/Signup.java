package com.api.beans;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "user_login", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Signup {
@Id
@GeneratedValue
private long id;
private String username;
private String password;
private long phonenumber;
private String email;


public long getId() {
	return id;
}
public String getUsername() {
	return username;
}
public String getPassword() {
	return password;
}
public long getPhonenumber() {
	return phonenumber;
}
public String getEmail() {
	return email;
}
public Signup() {}

public Signup(int id, String username, String password, long phonenumber, String email) {

	this.id = id;
	this.username = username;
	this.password = password;
	this.phonenumber = phonenumber;
	this.email = email;
}

}
