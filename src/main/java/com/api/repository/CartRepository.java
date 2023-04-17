package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.beans.Cart;
import com.api.beans.Cartdetails;

public interface CartRepository extends JpaRepository<Cart, String> {
 Cart findAllByusername(String cart);

}
