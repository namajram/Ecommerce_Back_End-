package com.api.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "cart")
public class Cart {
	@Id
	@GeneratedValue
	private long cartId;
	private String username;
	private String productsInCart;
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setProductsInCart(String productsInCart) {
		this.productsInCart = productsInCart;
	}
	public void setStatusOfCart(String statusOfCart) {
		this.statusOfCart = statusOfCart;
	}
	private String statusOfCart;
	public long getCartId() {
		return cartId;
	}
	public String getUserName() {
		return username;
	}
	public String getProductsInCart() {
		return productsInCart;
	}
	public String getStatusOfCart() {
		return statusOfCart;
	}
	public Cart() {
	
	}
	public Cart(long cartId, String username, String productsInCart, String statusOfCart) {
		super();
		this.cartId = cartId;
		this.username = username;
		this.productsInCart = productsInCart;
		this.statusOfCart = statusOfCart;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", username=" + username + ", productsInCart=" + productsInCart
				+ ", statusOfCart=" + statusOfCart + "]";
	}
	

}
