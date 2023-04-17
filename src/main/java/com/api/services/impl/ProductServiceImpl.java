package com.api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.repository.ProductRepository;
import com.api.service.ProductService;

public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository pr;
	

}
