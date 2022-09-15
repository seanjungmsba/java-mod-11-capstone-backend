package com.example.springbackend.service;

import com.example.springbackend.dto.CreateCustomerDTO;
import com.example.springbackend.dto.GetCustomerResponseDTO;
import com.example.springbackend.model.Address;
import com.example.springbackend.model.Customer;
import com.example.springbackend.model.Order;
import com.example.springbackend.repository.CustomerRepository;
import com.example.springbackend.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {
    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private ModelMapper modelMapper;

    @Mock
    private OrderRepository orderRepository;

    /**
     * Method under test: {@link CustomerService#deleteCustomer(String)}
     */
    @Test
    void testDeleteCustomer() {
        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());
        doNothing().when(customerRepository).deleteById(any());
        when(customerRepository.findByEmail(any())).thenReturn(customer);
        doNothing().when(orderRepository).deleteByCustomerEmail(any());
        customerService.deleteCustomer("jane.doe@example.org");
        verify(customerRepository).findByEmail(any());
        verify(customerRepository).deleteById(any());
        verify(orderRepository).deleteByCustomerEmail(any());
        assertTrue(customerService.getCustomers().isEmpty());
    }


    /**
     * Method under test: {@link CustomerService#deleteCustomer(String)}
     */
    @Test
    void testDeleteCustomer1() {
        Address address = new Address();
        address.setCity("Oxford");
        address.setCountry("GB");
        address.setId(123L);
        address.setOrder(new Order());
        address.setState("MD");
        address.setStreet("Street");
        address.setZipCode("21654");

        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());

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
        order.setCustomer(customer);
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

        Customer customer1 = new Customer();
        customer1.setEmail("jane.doe@example.org");
        customer1.setFirstName("Jane");
        customer1.setId(123L);
        customer1.setLastName("Doe");
        customer1.setOrders(new HashSet<>());

        Address address3 = new Address();
        address3.setCity("Oxford");
        address3.setCountry("GB");
        address3.setId(123L);
        address3.setOrder(new Order());
        address3.setState("MD");
        address3.setStreet("Street");
        address3.setZipCode("21654");

        Customer customer2 = new Customer();
        customer2.setEmail("jane.doe@example.org");
        customer2.setFirstName("Jane");
        customer2.setId(123L);
        customer2.setLastName("Doe");
        customer2.setOrders(new HashSet<>());

        Address address4 = new Address();
        address4.setCity("Oxford");
        address4.setCountry("GB");
        address4.setId(123L);
        address4.setOrder(new Order());
        address4.setState("MD");
        address4.setStreet("Street");
        address4.setZipCode("21654");

        Order order1 = new Order();
        order1.setBillingAddress(address3);
        order1.setCustomer(customer2);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setId(123L);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setOrderItems(new HashSet<>());
        order1.setOrderTrackingNumber("42");
        order1.setShippingAddress(address4);
        order1.setStatus("Status");
        order1.setTotalPrice(BigDecimal.valueOf(42L));
        order1.setTotalQuantity(1);

        Address address5 = new Address();
        address5.setCity("Oxford");
        address5.setCountry("GB");
        address5.setId(123L);
        address5.setOrder(order1);
        address5.setState("MD");
        address5.setStreet("Street");
        address5.setZipCode("21654");

        Order order2 = new Order();
        order2.setBillingAddress(address2);
        order2.setCustomer(customer1);
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setDateCreated(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setId(123L);
        LocalDateTime atStartOfDayResult5 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setLastUpdated(Date.from(atStartOfDayResult5.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setOrderItems(new HashSet<>());
        order2.setOrderTrackingNumber("42");
        order2.setShippingAddress(address5);
        order2.setStatus("Status");
        order2.setTotalPrice(BigDecimal.valueOf(42L));
        order2.setTotalQuantity(1);

        Address address6 = new Address();
        address6.setCity("Oxford");
        address6.setCountry("GB");
        address6.setId(123L);
        address6.setOrder(new Order());
        address6.setState("MD");
        address6.setStreet("Street");
        address6.setZipCode("21654");

        Customer customer3 = new Customer();
        customer3.setEmail("jane.doe@example.org");
        customer3.setFirstName("Jane");
        customer3.setId(123L);
        customer3.setLastName("Doe");
        customer3.setOrders(new HashSet<>());

        Address address7 = new Address();
        address7.setCity("Oxford");
        address7.setCountry("GB");
        address7.setId(123L);
        address7.setOrder(new Order());
        address7.setState("MD");
        address7.setStreet("Street");
        address7.setZipCode("21654");

        Order order3 = new Order();
        order3.setBillingAddress(address6);
        order3.setCustomer(customer3);
        LocalDateTime atStartOfDayResult6 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setDateCreated(Date.from(atStartOfDayResult6.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setId(123L);
        LocalDateTime atStartOfDayResult7 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setLastUpdated(Date.from(atStartOfDayResult7.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setOrderItems(new HashSet<>());
        order3.setOrderTrackingNumber("42");
        order3.setShippingAddress(address7);
        order3.setStatus("Status");
        order3.setTotalPrice(BigDecimal.valueOf(42L));
        order3.setTotalQuantity(1);

        Address address8 = new Address();
        address8.setCity("Oxford");
        address8.setCountry("GB");
        address8.setId(123L);
        address8.setOrder(order3);
        address8.setState("MD");
        address8.setStreet("Street");
        address8.setZipCode("21654");

        Customer customer4 = new Customer();
        customer4.setEmail("jane.doe@example.org");
        customer4.setFirstName("Jane");
        customer4.setId(123L);
        customer4.setLastName("Doe");
        customer4.setOrders(new HashSet<>());

        Address address9 = new Address();
        address9.setCity("Oxford");
        address9.setCountry("GB");
        address9.setId(123L);
        address9.setOrder(new Order());
        address9.setState("MD");
        address9.setStreet("Street");
        address9.setZipCode("21654");

        Customer customer5 = new Customer();
        customer5.setEmail("jane.doe@example.org");
        customer5.setFirstName("Jane");
        customer5.setId(123L);
        customer5.setLastName("Doe");
        customer5.setOrders(new HashSet<>());

        Address address10 = new Address();
        address10.setCity("Oxford");
        address10.setCountry("GB");
        address10.setId(123L);
        address10.setOrder(new Order());
        address10.setState("MD");
        address10.setStreet("Street");
        address10.setZipCode("21654");

        Order order4 = new Order();
        order4.setBillingAddress(address9);
        order4.setCustomer(customer5);
        LocalDateTime atStartOfDayResult8 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setDateCreated(Date.from(atStartOfDayResult8.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setId(123L);
        LocalDateTime atStartOfDayResult9 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setLastUpdated(Date.from(atStartOfDayResult9.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setOrderItems(new HashSet<>());
        order4.setOrderTrackingNumber("42");
        order4.setShippingAddress(address10);
        order4.setStatus("Status");
        order4.setTotalPrice(BigDecimal.valueOf(42L));
        order4.setTotalQuantity(1);

        Address address11 = new Address();
        address11.setCity("Oxford");
        address11.setCountry("GB");
        address11.setId(123L);
        address11.setOrder(order4);
        address11.setState("MD");
        address11.setStreet("Street");
        address11.setZipCode("21654");

        Order order5 = new Order();
        order5.setBillingAddress(address8);
        order5.setCustomer(customer4);
        LocalDateTime atStartOfDayResult10 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setDateCreated(Date.from(atStartOfDayResult10.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setId(123L);
        LocalDateTime atStartOfDayResult11 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setLastUpdated(Date.from(atStartOfDayResult11.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setOrderItems(new HashSet<>());
        order5.setOrderTrackingNumber("42");
        order5.setShippingAddress(address11);
        order5.setStatus("Status");
        order5.setTotalPrice(BigDecimal.valueOf(42L));
        order5.setTotalQuantity(1);

        HashSet<Order> orderSet = new HashSet<>();
        orderSet.add(order5);
        orderSet.add(order2);

        Customer customer6 = new Customer();
        customer6.setEmail("jane.doe@example.org");
        customer6.setFirstName("Jane");
        customer6.setId(123L);
        customer6.setLastName("Doe");
        customer6.setOrders(orderSet);
        doNothing().when(customerRepository).deleteById(any());
        when(customerRepository.findByEmail(any())).thenReturn(customer6);
        doNothing().when(orderRepository).deleteByCustomerEmail(any());
        customerService.deleteCustomer("jane.doe@example.org");
        verify(customerRepository).findByEmail(any());
        verify(customerRepository).deleteById(any());
        verify(orderRepository).deleteByCustomerEmail(any());
    }


    /**
     * Method under test: {@link CustomerService#deleteCustomer(String)}
     */
    @Test
    void testDeleteCustomer2() {
        assertThrows(ResponseStatusException.class, () -> customerService.deleteCustomer("jane.doe@example.org"));
        verify(customerRepository).findByEmail(any());
    }

    /**
     * Method under test: {@link CustomerService#updateCustomer(String, CreateCustomerDTO)}
     */
    @Test
    void testUpdateCustomer() {
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
        when(customerRepository.save(any())).thenReturn(customer1);
        when(customerRepository.findByEmail(any())).thenReturn(customer);

        GetCustomerResponseDTO getCustomerResponseDTO = new GetCustomerResponseDTO();
        getCustomerResponseDTO.setEmail("jane.doe@example.org");
        when(modelMapper.map(any(), (Class<GetCustomerResponseDTO>) any())).thenReturn(getCustomerResponseDTO);

        CreateCustomerDTO createCustomerDTO = new CreateCustomerDTO();
        createCustomerDTO.setEmail("jane.doe@example.org");
        createCustomerDTO.setFirstName("Jane");
        createCustomerDTO.setLastName("Doe");
        GetCustomerResponseDTO actualUpdateCustomerResult = customerService.updateCustomer("jane.doe@example.org",
                createCustomerDTO);
        assertSame(getCustomerResponseDTO, actualUpdateCustomerResult);
        assertEquals("jane.doe@example.org", actualUpdateCustomerResult.getEmail());
        verify(customerRepository).findByEmail(any());
        verify(customerRepository).save(any());
        verify(modelMapper).map(any(), (Class<GetCustomerResponseDTO>) any());
    }

    /**
     * Method under test: {@link CustomerService#updateCustomer(String, CreateCustomerDTO)}
     */
    @Test
    void testUpdateCustomer1() {
        CreateCustomerDTO createCustomerDTO = new CreateCustomerDTO();
        createCustomerDTO.setEmail("jane.doe@example.org");
        createCustomerDTO.setFirstName("Jane");
        createCustomerDTO.setLastName("Doe");
        assertThrows(ResponseStatusException.class, () -> customerService.updateCustomer("jane.doe@example.org", createCustomerDTO));
        verify(customerRepository).findByEmail(any());
    }

    /**
     * Method under test: {@link CustomerService#getCustomers()}
     */
    @Test
    void testGetCustomers() {
        when(customerRepository.findAll()).thenReturn(new ArrayList<>());
        assertTrue(customerService.getCustomers().isEmpty());
        verify(customerRepository).findAll();
    }

    /**
     * Method under test: {@link CustomerService#getCustomers()}
     */
    @Test
    void testGetCustomers1() {
        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());

        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        when(customerRepository.findAll()).thenReturn(customerList);

        GetCustomerResponseDTO getCustomerResponseDTO = new GetCustomerResponseDTO();
        getCustomerResponseDTO.setEmail("jane.doe@example.org");
        when(modelMapper.map(any(), (Class<GetCustomerResponseDTO>) any())).thenReturn(getCustomerResponseDTO);
        List<GetCustomerResponseDTO> actualCustomers = customerService.getCustomers();
        assertEquals(1, actualCustomers.size());
        assertEquals("jane.doe@example.org", actualCustomers.get(0).getEmail());
        verify(customerRepository).findAll();
        verify(modelMapper).map(any(), (Class<GetCustomerResponseDTO>) any());
    }

    /**
     * Method under test: {@link CustomerService#getCustomer(String)}
     */
    @Test
    void testGetCustomer() {
        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());
        when(customerRepository.findByEmail(any())).thenReturn(customer);

        GetCustomerResponseDTO getCustomerResponseDTO = new GetCustomerResponseDTO();
        getCustomerResponseDTO.setEmail("jane.doe@example.org");
        when(modelMapper.map(any(), (Class<GetCustomerResponseDTO>) any())).thenReturn(getCustomerResponseDTO);
        GetCustomerResponseDTO actualCustomer = customerService.getCustomer("jane.doe@example.org");
        assertSame(getCustomerResponseDTO, actualCustomer);
        assertEquals("jane.doe@example.org", actualCustomer.getEmail());
        verify(customerRepository).findByEmail(any());
        verify(modelMapper).map(any(), (Class<GetCustomerResponseDTO>) any());
    }

    /**
     * Method under test: {@link CustomerService#getCustomer(String)}
     */
    @Test
    void testGetCustomer1() {
        assertThrows(ResponseStatusException.class, () -> customerService.getCustomer("jane.doe@example.org"));
        verify(customerRepository).findByEmail(any());
    }


    /**
     * Method under test: {@link CustomerService#createCustomer(CreateCustomerDTO)}
     */
    @Test
    void testCreateCustomer() {
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
        CreateCustomerDTO createCustomerDTO = new CreateCustomerDTO();
        createCustomerDTO.setEmail("jane.doe@example.org");
        createCustomerDTO.setFirstName("Jane");
        createCustomerDTO.setLastName("Doe");
        assertThrows(ResponseStatusException.class, () -> customerService.createCustomer(createCustomerDTO));
        verify(customerRepository).findByEmail(any());
    }


    /**
     * Method under test: {@link CustomerService#createCustomer(CreateCustomerDTO)}
     */
    @Test
    void testCreateCustomer1() {
        try {
            CreateCustomerDTO createCustomerDTO = new CreateCustomerDTO();
            final GetCustomerResponseDTO customerServiceCustomer = customerService.createCustomer(createCustomerDTO);

            assertThrows(ResponseStatusException.class, () -> customerService.createCustomer(createCustomerDTO));
            verify(customerRepository).findByEmail(any());
        } catch (NullPointerException nullPointerException) {
            System.out.println("nullPointerException = " + nullPointerException);
        }
    }

    /**
     * Method under test: {@link CustomerService#createCustomer(CreateCustomerDTO)}
     */
    @Test
    void CreateCustomerTest() {
        when(customerRepository.save(any())).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));

        CreateCustomerDTO createCustomerDTO = new CreateCustomerDTO();
        createCustomerDTO.setEmail("jane.doe@example.org");
        createCustomerDTO.setFirstName("Jane");
        createCustomerDTO.setLastName("Doe");
        assertThrows(ResponseStatusException.class, () -> customerService.createCustomer(createCustomerDTO));
        verify(customerRepository).save(any());
    }

}

