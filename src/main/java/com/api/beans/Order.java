package com.api.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "order_user")
public class Order {
	@Id
	@GeneratedValue
	private long orderId;
	private long cartId;
	private long orderAmount;
	public Order() {
		
	}
	public long getOrderid() {
		return orderId;
	}
	public void setOrderid(long orderid) {
		this.orderId = orderid;
	}
	public long getCartId() {
		return cartId;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	public long getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(long orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Order(long orderid, long cartId, long orderAmount) {
		super();
		this.orderId = orderid;
		this.cartId = cartId;
		this.orderAmount = orderAmount;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderId + ", cartId=" + cartId + ", orderAmount=" + orderAmount + "]";
	}
	

}
