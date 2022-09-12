package com.example.springbackend.service;

import com.example.springbackend.dto.CreateCustomerDTO;
import com.example.springbackend.dto.GetCustomerResponseDTO;
import com.example.springbackend.model.Customer;
import com.example.springbackend.repository.CustomerRepository;
import com.example.springbackend.repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService implements CustomerInterface {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void deleteCustomer(String email) {
        Customer customer = customerRepository.findByEmail(email);

        if (customer == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Customer Not Found"
            );
        }

        customer.getOrders().forEach(order -> {
            order.getOrderItems().remove(order);
        });

        orderRepository.deleteByCustomerEmail(email);
        customerRepository.deleteById(customer.getId());

    }

    @Override
    public GetCustomerResponseDTO updateCustomer(String email, CreateCustomerDTO customerDTO) {

        // if a customer doesn't exist by its email address, throw an error
        Customer customer = customerRepository.findByEmail(email);

        if (customer == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Customer Not Found"
            );
        }

        // update customer information
        customer.setFirstName(customerDTO.getFirstName());
        customer.setLastName(customerDTO.getLastName());
        customer.setEmail(customerDTO.getEmail());

        try {
            // save the updated changes
            customer = customerRepository.save(customer);
        } catch (Exception e) {
            // catch exception if there is any error
            System.err.println(e);
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "validation errors", e);
        }

        // Convert customer to GetCustomerResponseDTO object
        GetCustomerResponseDTO getCustomerResponseDTO = mapper.map(customer, GetCustomerResponseDTO.class);

        // properly update email
        getCustomerResponseDTO.setEmail(customer.getEmail());

        // return getCustomerResponseDTO
        return getCustomerResponseDTO;

    }

    @Override
    public List<GetCustomerResponseDTO> getCustomers() {
        return customerRepository.findAll() // get all customers from repository
                .stream()
                .map(customer -> {
                    // for each customer, convert to GetCustomerResponseDTO
                    GetCustomerResponseDTO getCustomerResponseDTO = mapper.map(customer, GetCustomerResponseDTO.class);
                    // get email of the customer
                    String customerEmail = customer.getEmail();
                    // set email
                    getCustomerResponseDTO.setEmail(customerEmail);
                    // return BookDTO
                    return getCustomerResponseDTO;
                })
                .collect(Collectors.toList()); // convert to List<GetCustomerResponseDTO>
    }

    @Override
    public GetCustomerResponseDTO getCustomer(String email) {

        // find a customer by its email
        Customer customer = customerRepository.findByEmail(email);

        if (customer == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Customer Not Found"
            );
        }

        // convert a customer to GetCustomerResponseDTO object
        GetCustomerResponseDTO getCustomerResponseDTO = mapper.map(customer, GetCustomerResponseDTO.class);

        // get email
        String customerEmail = customer.getEmail();

        // set email
        getCustomerResponseDTO.setEmail(customerEmail);

        return getCustomerResponseDTO;
    }

    @Override
    public GetCustomerResponseDTO createCustomer(CreateCustomerDTO customerDTO) {

        // get first name
        String firstName = customerDTO.getFirstName();

        // get first name
        String lastName = customerDTO.getLastName();

        // get email
        String emailAddress = customerDTO.getEmail();


        // get customer from email address
        Customer customer = customerRepository.findByEmail(emailAddress);

        // if the customer already exists, throw an exception
        if (customer != null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Customer Not Found"
            );
        }

        // if the customer is new, create new customer and set its name and email address
        customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(emailAddress);

        try {
            // save customer
            customer = customerRepository.save(customer);
        } catch (Exception e) {
            // catch exception if there is any error
            System.err.println(e);
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "validation errors", e);
        }

        // convert customer to GetCustomerResponseDTO object
        GetCustomerResponseDTO getCustomerResponseDTO = mapper.map(customer, GetCustomerResponseDTO.class);

        // set its email field
        getCustomerResponseDTO.setEmail(customer.getEmail());

        return getCustomerResponseDTO;

    }
}
