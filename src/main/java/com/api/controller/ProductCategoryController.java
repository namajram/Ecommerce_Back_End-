package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.beans.CreateProductCategoryRequest;
import com.api.beans.ProductCategory;
import com.api.service.ProductCategoryService;

import jakarta.validation.Valid;

@RestController
public class ProductCategoryController {
	
	@Autowired
	ProductCategoryService pcs;
	
	@GetMapping("/ProductCategory/{ProductCategoryId}")
	public ResponseEntity<ProductCategory> getProductCategory(@PathVariable String ProductCategoryId) {
		// TODO Auto-generated method stub

		ProductCategory productCategory = pcs.getProductCategory(ProductCategoryId);
		return new ResponseEntity(productCategory, HttpStatus.OK);
	}
	
	@PostMapping("/ProductCategory")
	public ResponseEntity<String> createProductCategory(@RequestBody @Valid CreateProductCategoryRequest createProductCategoryRequest) {
		// TODO Auto-generated method stub
		String createProductCategory = pcs.CreateProductCategory(createProductCategoryRequest);
		return new ResponseEntity<>(createProductCategory +"is created", HttpStatus.CREATED);

	}
	
	@DeleteMapping("/ProductCategory/{ProductCategoryId}")
	public ResponseEntity deleteProductCategory(@PathVariable String ProductCategoryId) {
		// TODO Auto-generated method stub
		pcs.deleteProductCategory(ProductCategoryId);
		return new ResponseEntity(HttpStatus.OK);

	}

}
