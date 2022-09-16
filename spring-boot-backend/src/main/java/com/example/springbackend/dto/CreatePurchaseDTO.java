package com.example.springbackend.dto;

import com.example.springbackend.model.Address;
import com.example.springbackend.model.Customer;
import com.example.springbackend.model.Order;
import com.example.springbackend.model.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class CreatePurchaseDTO {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}