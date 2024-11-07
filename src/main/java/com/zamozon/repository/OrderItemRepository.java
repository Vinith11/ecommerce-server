package com.zamozon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zamozon.modal.OrderItem;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
