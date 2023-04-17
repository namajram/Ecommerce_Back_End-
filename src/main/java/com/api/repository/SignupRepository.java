package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.api.beans.Signup;



public interface SignupRepository extends JpaRepository<Signup, String>{
	Signup findByEmail(String e);
	Signup findByUsername(String u);
	Signup findByUsernameAndPassword(String u, String p);
	Signup findByPassword(String p);
}
