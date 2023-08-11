package com.evergreen.orderserivce.repository;

import com.evergreen.orderserivce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
