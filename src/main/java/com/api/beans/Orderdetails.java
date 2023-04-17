package com.api.beans;

import org.springframework.stereotype.Component;

@Component
public class Orderdetails {
	private String username;
	private long orderAmount;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(long orderAmount) {
		this.orderAmount = orderAmount;
	}

}
