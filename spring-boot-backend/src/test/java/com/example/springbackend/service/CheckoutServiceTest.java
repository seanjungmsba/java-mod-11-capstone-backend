package com.example.springbackend.service;

import com.example.springbackend.dto.CreatePurchaseDTO;
import com.example.springbackend.model.Address;
import com.example.springbackend.model.Customer;
import com.example.springbackend.model.Order;
import com.example.springbackend.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CheckoutServiceTest {
    @InjectMocks
    private CheckoutService checkoutService;

    @Mock
    private CustomerRepository customerRepository;

    /**
     * Method under test: {@link CheckoutService#placeOrder(CreatePurchaseDTO)}
     */
    @Test
    void testPlaceOrder() {
        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());

        Customer customer1 = new Customer();
        customer1.setEmail("jane.doe@example.org");
        customer1.setFirstName("Jane");
        customer1.setId(123L);
        customer1.setLastName("Doe");
        customer1.setOrders(new HashSet<>());
        when(customerRepository.findByEmail(any())).thenReturn(customer);
        when(customerRepository.save(any())).thenReturn(customer1);

        Address address = new Address();
        address.setCity("Oxford");
        address.setCountry("GB");
        address.setId(123L);
        address.setOrder(new Order());
        address.setState("MD");
        address.setStreet("Street");
        address.setZipCode("21654");

        Customer customer2 = new Customer();
        customer2.setEmail("jane.doe@example.org");
        customer2.setFirstName("Jane");
        customer2.setId(123L);
        customer2.setLastName("Doe");
        customer2.setOrders(new HashSet<>());

        Address address1 = new Address();
        address1.setCity("Oxford");
        address1.setCountry("GB");
        address1.setId(123L);
        address1.setOrder(new Order());
        address1.setState("MD");
        address1.setStreet("Street");
        address1.setZipCode("21654");

        Order order = new Order();
        order.setBillingAddress(address);
        order.setCustomer(customer2);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        order.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        order.setOrderItems(new HashSet<>());
        order.setOrderTrackingNumber("42");
        order.setShippingAddress(address1);
        order.setStatus("Status");
        order.setTotalPrice(BigDecimal.valueOf(42L));
        order.setTotalQuantity(1);

        Address address2 = new Address();
        address2.setCity("Oxford");
        address2.setCountry("GB");
        address2.setId(123L);
        address2.setOrder(order);
        address2.setState("MD");
        address2.setStreet("Street");
        address2.setZipCode("21654");

        Customer customer3 = new Customer();
        customer3.setEmail("jane.doe@example.org");
        customer3.setFirstName("Jane");
        customer3.setId(123L);
        customer3.setLastName("Doe");
        customer3.setOrders(new HashSet<>());

        Order order1 = new Order();
        order1.setBillingAddress(new Address());
        order1.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setId(123L);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setOrderItems(new HashSet<>());
        order1.setOrderTrackingNumber("42");
        order1.setShippingAddress(new Address());
        order1.setStatus("Status");
        order1.setTotalPrice(null);
        order1.setTotalQuantity(1);

        Address address3 = new Address();
        address3.setCity("Oxford");
        address3.setCountry("GB");
        address3.setId(123L);
        address3.setOrder(order1);
        address3.setState("MD");
        address3.setStreet("Street");
        address3.setZipCode("21654");

        Customer customer4 = new Customer();
        customer4.setEmail("jane.doe@example.org");
        customer4.setFirstName("Jane");
        customer4.setId(123L);
        customer4.setLastName("Doe");
        customer4.setOrders(new HashSet<>());

        Order order2 = new Order();
        order2.setBillingAddress(new Address());
        order2.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setDateCreated(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setId(123L);
        LocalDateTime atStartOfDayResult5 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setLastUpdated(Date.from(atStartOfDayResult5.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setOrderItems(new HashSet<>());
        order2.setOrderTrackingNumber("42");
        order2.setShippingAddress(new Address());
        order2.setStatus("Status");
        order2.setTotalPrice(null);
        order2.setTotalQuantity(1);

        Address address4 = new Address();
        address4.setCity("Oxford");
        address4.setCountry("GB");
        address4.setId(123L);
        address4.setOrder(order2);
        address4.setState("MD");
        address4.setStreet("Street");
        address4.setZipCode("21654");

        Order order3 = new Order();
        order3.setBillingAddress(address3);
        order3.setCustomer(customer4);
        LocalDateTime atStartOfDayResult6 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setDateCreated(Date.from(atStartOfDayResult6.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setId(123L);
        LocalDateTime atStartOfDayResult7 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setLastUpdated(Date.from(atStartOfDayResult7.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setOrderItems(new HashSet<>());
        order3.setOrderTrackingNumber("42");
        order3.setShippingAddress(address4);
        order3.setStatus("Status");
        order3.setTotalPrice(BigDecimal.valueOf(42L));
        order3.setTotalQuantity(1);

        Address address5 = new Address();
        address5.setCity("Oxford");
        address5.setCountry("GB");
        address5.setId(123L);
        address5.setOrder(new Order());
        address5.setState("MD");
        address5.setStreet("Street");
        address5.setZipCode("21654");

        Customer customer5 = new Customer();
        customer5.setEmail("jane.doe@example.org");
        customer5.setFirstName("Jane");
        customer5.setId(123L);
        customer5.setLastName("Doe");
        customer5.setOrders(new HashSet<>());

        Address address6 = new Address();
        address6.setCity("Oxford");
        address6.setCountry("GB");
        address6.setId(123L);
        address6.setOrder(new Order());
        address6.setState("MD");
        address6.setStreet("Street");
        address6.setZipCode("21654");

        Order order4 = new Order();
        order4.setBillingAddress(address5);
        order4.setCustomer(customer5);
        LocalDateTime atStartOfDayResult8 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setDateCreated(Date.from(atStartOfDayResult8.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setId(123L);
        LocalDateTime atStartOfDayResult9 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setLastUpdated(Date.from(atStartOfDayResult9.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setOrderItems(new HashSet<>());
        order4.setOrderTrackingNumber("42");
        order4.setShippingAddress(address6);
        order4.setStatus("Status");
        order4.setTotalPrice(BigDecimal.valueOf(42L));
        order4.setTotalQuantity(1);

        Address address7 = new Address();
        address7.setCity("Oxford");
        address7.setCountry("GB");
        address7.setId(123L);
        address7.setOrder(order4);
        address7.setState("MD");
        address7.setStreet("Street");
        address7.setZipCode("21654");

        CreatePurchaseDTO createPurchaseDTO = new CreatePurchaseDTO();
        createPurchaseDTO.setBillingAddress(address2);
        createPurchaseDTO.setCustomer(customer3);
        createPurchaseDTO.setOrder(order3);
        createPurchaseDTO.setOrderItems(new HashSet<>());
        createPurchaseDTO.setShippingAddress(address7);
        checkoutService.placeOrder(createPurchaseDTO);
        verify(customerRepository).findByEmail(any());
        verify(customerRepository).save(any());
        Address expectedShippingAddress = createPurchaseDTO.getShippingAddress();
        Order order5 = createPurchaseDTO.getOrder();
        assertSame(expectedShippingAddress, order5.getShippingAddress());
        Address expectedBillingAddress = createPurchaseDTO.getBillingAddress();
        assertSame(expectedBillingAddress, order5.getBillingAddress());
        assertSame(customer, order5.getCustomer());
    }
}

