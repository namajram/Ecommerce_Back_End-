package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.beans.Cart;

import com.api.beans.Order;
import com.api.beans.Orderdetails;
import com.api.repository.CartRepository;
import com.api.repository.OrderRepository;

@RestController
public class OrderController {
	@Autowired
	OrderRepository or;
	@Autowired
	CartRepository cr;
	
	@PostMapping("/order")
	public Order putOrder(@RequestBody Orderdetails orderdetails) {
		Cart findAllByusername = cr.findAllByusername(orderdetails.getUsername());
		long id = findAllByusername.getCartId();
		long orderAmount = orderdetails.getOrderAmount();
		Order o= new Order();
		o.setCartId(id);
		o.setOrderAmount(orderAmount);
		return or.save(o);
		
	}
}

