package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.api.beans.Product;

import com.api.repository.ProductRepository;

@RestController
public class ProductController {
	@Autowired
	ProductRepository pr;

	@GetMapping("/Product/{productCode}")
	private List<Product> getProduct(@PathVariable String productCode) {
		String upperCase = productCode.toUpperCase();

		List<Product> products = pr.findAllByProductCodeLike(upperCase);
		return products;

	}
	
	@GetMapping("/Product/{productName}")
	private  List<Product> getProductName(@PathVariable String productName) {
		
	List<Product> findAllByProductName = pr.findAllByProductName(productName);
		return  findAllByProductName;
		
	}

	@PutMapping("/Product")
	private Product PutProduct(@RequestBody Product h) {
		return pr.save(h);
	}

//	@GetMapping("/Product")
//	private String getProduct(@RequestBody Product h) {
//		String productCode = h.getProductCode();
//
//		Product findAllByProductCodeLike = pr.findAllByProductCodeLike(productCode.toUpperCase());
//		return findAllByProductCodeLike.toString();
//
//	}
}
