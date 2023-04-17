package com.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.beans.CreateProductCategoryRequest;
import com.api.beans.ProductCategory;
import com.api.repository.ProductCategoryRepository;
import com.api.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	@Autowired
	ProductCategoryRepository pcr;

	@Override
	public ProductCategory getProductCategory(String productCategoryId) {
		Optional<ProductCategory> findById = pcr.findById(productCategoryId);
		ProductCategory productCategory = findById.orElseThrow();
		return productCategory;
	}

	@Override
	public List<ProductCategory> getAllProductCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String CreateProductCategory(CreateProductCategoryRequest createProductCategoryRequest) {
		ProductCategory pc= new ProductCategory();
		pc.setProductCategoryName(createProductCategoryRequest.getProductName());
		pc.setDescription(createProductCategoryRequest.getDescription());
		ProductCategory save = pcr.save(pc);
		return save.getProductCategoryId();
	}

	@Override
	public void deleteProductCategory(String productCategoryId) {
		// TODO Auto-generated method stub
		pcr.deleteById(productCategoryId);		
	}

}
