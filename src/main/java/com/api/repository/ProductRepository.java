package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.beans.Product;


public interface ProductRepository extends JpaRepository<Product, String> {
	

	List<Product> findAllByProductCodeLike(String u);
	Product findByProductCodeIgnoreCase(String l);
	List<Product> findAllByProductName(String p);

}
