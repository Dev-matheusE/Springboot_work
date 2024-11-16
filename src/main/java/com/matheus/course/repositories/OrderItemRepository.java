package com.matheus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.course.entities.OrderItem;
import com.matheus.course.entities.pk.OrderItemPk;


public interface  OrderItemRepository extends JpaRepository<OrderItem,OrderItemPk> {

}
