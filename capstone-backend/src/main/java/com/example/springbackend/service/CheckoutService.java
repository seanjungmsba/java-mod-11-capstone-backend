package com.example.springbackend.service;

import com.example.springbackend.dto.Purchase;
import com.example.springbackend.dto.PurchaseResponse;
import com.example.springbackend.model.Customer;
import com.example.springbackend.model.Order;
import com.example.springbackend.model.OrderItem;
import com.example.springbackend.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutService implements CheckoutInterface {

    private final CustomerRepository customerRepository;

    public CheckoutService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        // retrieve the order info from dto
        Order order = purchase.getOrder();

        // generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        // populate order with orderItems
        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(item -> order.add(item));

        // populate order with billingAddress and shippingAddress
        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());

        // populate customer with order
        Customer customer = purchase.getCustomer();

        // check if this is an existing customer
        String theEmailAddress = customer.getEmail();
        Customer customerFromDatabase = customerRepository.findByEmail(theEmailAddress);

        // if customer is an existing customer, assign accordingly
        if (customerFromDatabase != null ) {
            customer = customerFromDatabase;
        }

        customer.add(order);

        // save to the database
        customerRepository.save(customer);

        // return a response
        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        // generate a random UUID number (UUID version-4)
        // For details see: https://en.wikipedia.org/wiki/Universally_unique_identifier
        return UUID.randomUUID().toString();
    }
}









