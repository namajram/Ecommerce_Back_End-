package com.api.service;

import java.util.List;

import com.api.beans.CreateProductCategoryRequest;
import com.api.beans.ProductCategory;

public interface ProductCategoryService {
	ProductCategory getProductCategory(String productCategoryId);
	List<ProductCategory> getAllProductCategory();
	String CreateProductCategory(CreateProductCategoryRequest createProductCategoryRequest);
	void deleteProductCategory(String productCategoryId);
	

}
