package com.zamozon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zamozon.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
