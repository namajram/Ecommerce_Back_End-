package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.beans.Signup;



public interface LoginRepository extends JpaRepository<Signup, String>{
	Signup findByEmail(String e);
}
