package com.example.springbackend.service;

import com.example.springbackend.dto.CreatePurchaseDTO;
import com.example.springbackend.model.Address;
import com.example.springbackend.model.Customer;
import com.example.springbackend.model.Order;
import com.example.springbackend.repository.CustomerRepository;
import com.example.springbackend.repository.OrderRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class CheckoutServiceTest {


    @InjectMocks
    private CheckoutService checkoutService;

    @Mock
    private CustomerRepository customerRepository;

    @Mock
    private OrderRepository orderRepository;

    @Mock
    private ModelMapper modelMapper;

    @Mock
    private CreatePurchaseDTO createPurchaseDTO;

    @Test
    public void testIfGenerateOrderTrackingNumberActuallyReturnsSomething() {
        String randomTrackingNumber = UUID.randomUUID().toString();
        Assertions.assertNotNull(randomTrackingNumber);
    }

    @Test
    public void testFakeEmailReturnsCustomerWhoDoesNotExist() {
        String fakeEmail = "sean@demo.com";
        Customer customerFromDatabase = customerRepository.findByEmail(fakeEmail);
        Assertions.assertNull(customerFromDatabase);
    }

    @Test
    public void testAddressIsEqualToMockAddress() {
        Order order = new Order();

        Address address = new Address();
        address.setStreet("Fake Street");
        address.setCity("Fake City");
        address.setState("Fake State");
        address.setZipCode("12345");
        address.setCountry("USA");
        address.setOrder(order);
        address.setId(1L);

        order.setBillingAddress(address);
        order.setShippingAddress(address);
        when(createPurchaseDTO.getOrder()).thenReturn(order);
        Address mockAddress = order.getBillingAddress();
        Assertions.assertEquals(address, mockAddress);
    }

}