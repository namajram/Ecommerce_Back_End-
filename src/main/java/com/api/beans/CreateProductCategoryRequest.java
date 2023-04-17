package com.api.beans;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class CreateProductCategoryRequest {
	@NotNull(message = "product name should not be null")
	@NotEmpty(message = "product name should not be empty")
	private String productName;
	private String description;
	private double price;
	@NotNull(message = "productCategoryId should not be null")
	@NotEmpty(message = "productCategoryId should not be empty")
	private String productCategoryId;
	
	public CreateProductCategoryRequest() {}
	public CreateProductCategoryRequest(String productName, String description, double price,
			String productCategoryId) {
		super();
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.productCategoryId = productCategoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	@Override
	public String toString() {
		return "CreateProductCategoryRequest [productName=" + productName + ", description=" + description + ", price="
				+ price + ", productCategoryId=" + productCategoryId + "]";
	}
	
}
