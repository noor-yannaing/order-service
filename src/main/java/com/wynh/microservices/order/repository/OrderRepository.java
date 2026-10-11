package com.wynh.microservices.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wynh.microservices.order.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
}
