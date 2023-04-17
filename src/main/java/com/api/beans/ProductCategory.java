package com.api.beans;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Table(name = "ProductCategory", uniqueConstraints = @UniqueConstraint(columnNames = "productCategoryId"))
public class ProductCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "productCategoryId", updatable = false, nullable = false)
	private String productCategoryId;
	@Column(name = "productCategoryName", nullable = false)
	private String productCategoryName;
	private String description;
	
	public ProductCategory() {
		
	}

	public ProductCategory(String productCategoryId, String productCategoryName, String description) {
		super();
		this.productCategoryId = productCategoryId;
		this.productCategoryName = productCategoryName;
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductCategory [productCategoryId=" + productCategoryId + ", productCategoryName="
				+ productCategoryName + ", description=" + description + "]";
	}

	public String getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
