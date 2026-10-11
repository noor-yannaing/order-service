package com.wynh.microservices.order.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.wynh.microservices.order.dto.OrderRequest;
import com.wynh.microservices.order.model.Order;
import com.wynh.microservices.order.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
	
	private final OrderRepository orderRepository;
	
	public Order placeOrder(OrderRequest orderRequest) {
		
		Order order = new Order();
		order.setOrderNumber(UUID.randomUUID().toString());
		order.setPrice(orderRequest.price());
		order.setQuantity(orderRequest.quantity());
		order.setSkuCode(orderRequest.skuCode());
		
		return orderRepository.save(order);
		
		
	}
	
	
	
}
