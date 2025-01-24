package com.antares.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antares.dscommerce.entities.OrderItemPk;
import com.antares.dscommerce.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
    
}
