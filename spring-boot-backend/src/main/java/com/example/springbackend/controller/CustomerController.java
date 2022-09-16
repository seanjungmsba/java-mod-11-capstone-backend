package com.example.springbackend.controller;

import com.example.springbackend.dto.CreateCustomerDTO;
import com.example.springbackend.dto.GetCustomerResponseDTO;
import com.example.springbackend.exception.NotFoundException;
import com.example.springbackend.exception.ValidationException;
import com.example.springbackend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @DeleteMapping("/{email}")
    public void deleteCustomer(@PathVariable String email) {
        try {
            customerService.deleteCustomer(email);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Customer Not Found", e);
        }
    }

    @PutMapping("/{email}")
    public GetCustomerResponseDTO updateCustomer(@PathVariable String email,
                                                 @RequestBody CreateCustomerDTO customerDTO) {
        try {
            return customerService.updateCustomer(email, customerDTO);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Customer Not Found", e);
        }
    }

    @GetMapping
    public List<GetCustomerResponseDTO> getCustomers() {
        try {
            return customerService.getCustomers();
        } catch (NotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Customer Not Found", e);
        }
    }

    @GetMapping("/{email}")
    public GetCustomerResponseDTO getCustomer(@PathVariable String email) {
        try {
            return customerService.getCustomer(email);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Customer Not Found", e);
        }
    }

    @PostMapping
    public GetCustomerResponseDTO createCustomer(@RequestBody CreateCustomerDTO customerDTO) {
        try {
            return customerService.createCustomer(customerDTO);
        } catch (ValidationException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE, "Customer Not Found", e);
        }
    }

}