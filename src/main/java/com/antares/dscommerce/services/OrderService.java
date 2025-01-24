package com.antares.dscommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antares.dscommerce.dto.OrderDTO;
import com.antares.dscommerce.entities.Order;
import com.antares.dscommerce.repositories.OrderRepository;
import com.antares.dscommerce.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {

     @Autowired
    OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Optional<Order> result = repository.findById(id);
        Order order = result.orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        OrderDTO dto = new OrderDTO(order);
        return dto;
    }
    
}
