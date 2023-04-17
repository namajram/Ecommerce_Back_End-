package com.api.controller;


import java.lang.reflect.Type;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.beans.*;
import com.api.repository.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@RestController
public class CartController {
	@Autowired
	CartRepository cr;
	@Autowired
	ProductRepository pr;

	@PostMapping("/Carts")
	public Cart postCarts(@RequestBody Cart cart) {
		return cr.save(cart);
	}

	@PostMapping("/cart")
	public Cart postCart(@RequestBody CartRequest cartRequest) {
		Cart cart = cr.findAllByusername(cartRequest.getUsername());
	 String productsInCart = cart.getProductsInCart();
	 
	 Optional<Product> id = pr.findById(cartRequest.getProductID());
	 Product product = id.get();
	 String name = product.getProductName();
	 
	 String productID = cartRequest.getProductID();
	 int quantity = cartRequest.getQuantity();
	 
	 Cartdetails c= new Cartdetails();
	 c.setProductId(productID);
	 c.setProductName(name);
	 c.setQuantity(quantity);
	 Gson g= new Gson();
	 Type cartdetailsListType =new TypeToken<ArrayList<Cartdetails>>(){}.getType();
	 List<Cartdetails> json = g.fromJson(productsInCart, cartdetailsListType);
	 json.add(c);
 String json1 = g.toJson(json);
 cart.setProductsInCart(json1);

 
return cr.save(cart);	 
	}
	
	@GetMapping("/Cart/{user}")
	private Cart getCart(@PathVariable String user) {
		
Cart findAllByusername = cr.findAllByusername(user);
		return  findAllByusername;
		
	}
	
	
}
