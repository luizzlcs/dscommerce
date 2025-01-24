package com.antares.dscommerce.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.antares.dscommerce.entities.Order;
import com.antares.dscommerce.entities.OrderItem;
import com.antares.dscommerce.entities.OrderStatus;

public class OrderDTO {
    private Long id;
    private Instant moment;
    private OrderStatus status;
    private ClientDTO client;
    private PaymentDTO pyment;
    private List<OrderItemDTO> items = new ArrayList<>();
    
    public OrderDTO(Long id, Instant moment, OrderStatus status, ClientDTO client, PaymentDTO pyment) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.pyment = pyment;
    }

    public OrderDTO(Order entity) {
        id = entity.getId();      
        moment = entity.getMoment();
        status = entity.getStatus();
        client = new ClientDTO(entity.getClient());
        pyment = (entity.getPayment() == null) ? null : new PaymentDTO(entity.getPayment());
        for(OrderItem item : entity.getItems()){
            OrderItemDTO itemDTO = new OrderItemDTO(item);
            items.add(itemDTO);
        }
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public ClientDTO getClient() {
        return client;
    }

    public PaymentDTO getPyment() {
        return pyment;
    }

    public List<OrderItemDTO> getItems() {
        return items;
    }

    public Double getTotal(){
        double sum = 0.0;
        for(OrderItemDTO item: items){
            sum += item.getSubTotal();
        }
        return sum;
    }
}


