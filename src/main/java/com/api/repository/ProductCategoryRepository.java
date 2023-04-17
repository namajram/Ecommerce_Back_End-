package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.beans.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String>{

}
