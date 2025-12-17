package com.emperio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emperio.course.entities.OrderItem;
import com.emperio.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
