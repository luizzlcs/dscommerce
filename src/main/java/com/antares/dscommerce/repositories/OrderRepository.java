package com.antares.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antares.dscommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
