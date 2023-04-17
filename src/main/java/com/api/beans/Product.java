package com.api.beans;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity

@Table(name = "product", uniqueConstraints = @UniqueConstraint(columnNames = "productCode"))
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
@Column(name = "productId", updatable = false, nullable = false)
private long productId;
@Column(name = "productName", nullable = false)
private String productName;
private String productCode;
private String description;
private long price;
private long rating;
private String manufacturer;
private String ostype;
@Column(name = "availableItemCount")
private int availableItemCount;
@ManyToOne
@JoinColumn(name = "productCategoryId")
private ProductCategory productCategoryId;

public Product() {
	
}



public Product(long productId, String productName, String productCode, String description, long price, long rating,
		String manufacturer, String ostype, int availableItemCount, ProductCategory productCategoryId) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productCode = productCode;
	this.description = description;
	this.price = price;
	this.rating = rating;
	this.manufacturer = manufacturer;
	this.ostype = ostype;
	this.availableItemCount = availableItemCount;
	this.productCategoryId = productCategoryId;
}



public long getProductId() {
	return productId;
}
public String getProductName() {
	return productName;
}
public String getProductCode() {
	return productCode;
}
public String getDescription() {
	return description;
}
public long getPrice() {
	return price;
}
public long getRating() {
	return rating;
}
public String getManufacturer() {
	return manufacturer;
}
public String getOstype() {
	return ostype;
}


public void setProductId(long productId) {
	this.productId = productId;
}


public void setProductName(String productName) {
	this.productName = productName;
}


public void setProductCode(String productCode) {
	this.productCode = productCode;
}


public void setDescription(String description) {
	this.description = description;
}


public void setPrice(long price) {
	this.price = price;
}


public void setRating(long rating) {
	this.rating = rating;
}


public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}


public void setOstype(String ostype) {
	this.ostype = ostype;
}




public int getAvailableItemCount() {
	return availableItemCount;
}



public void setAvailableItemCount(int availableItemCount) {
	this.availableItemCount = availableItemCount;
}



public ProductCategory getProductCategoryId() {
	return productCategoryId;
}



public void setProductCategoryId(ProductCategory productCategoryId) {
	this.productCategoryId = productCategoryId;
}



@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productCode=" + productCode
			+ ", description=" + description + ", price=" + price + ", rating=" + rating + ", manufacturer="
			+ manufacturer + ", ostype=" + ostype + ", availableItemCount=" + availableItemCount
			+ ", productCategoryId=" + productCategoryId + "]";
}










}
