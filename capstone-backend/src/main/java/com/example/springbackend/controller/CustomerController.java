package com.example.springbackend.controller;

import com.example.springbackend.dto.CreateCustomerDTO;
import com.example.springbackend.dto.GetCustomerResponseDTO;
import com.example.springbackend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @DeleteMapping("/{email}")
    public void deleteCustomer(@PathVariable String email){
        customerService.deleteCustomer(email);
    }

    @PutMapping("/{email}")
    public GetCustomerResponseDTO updateCustomer(@PathVariable String email, @RequestBody CreateCustomerDTO customerDTO){
        return customerService.updateCustomer(email, customerDTO);
    }

    @GetMapping
    public List<GetCustomerResponseDTO> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("/{email}")
    public GetCustomerResponseDTO getCustomer(@PathVariable String email){
        return customerService.getCustomer(email);
    }

    @PostMapping
    public GetCustomerResponseDTO createCustomer(@RequestBody CreateCustomerDTO customerDTO){
        return customerService.createCustomer(customerDTO);
    }

}
