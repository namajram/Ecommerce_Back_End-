package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.beans.*;

public interface OrderRepository extends JpaRepository<Order, String> {

}
