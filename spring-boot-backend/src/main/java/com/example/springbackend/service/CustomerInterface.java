package com.example.springbackend.service;

import com.example.springbackend.dto.CreateCustomerDTO;
import com.example.springbackend.dto.GetCustomerResponseDTO;

import java.util.List;

public interface CustomerInterface {
    void deleteCustomer(String email);

    GetCustomerResponseDTO updateCustomer(String email, CreateCustomerDTO customerDTO);

    List<GetCustomerResponseDTO> getCustomers();

    GetCustomerResponseDTO getCustomer(String email);

    GetCustomerResponseDTO createCustomer(CreateCustomerDTO customerDTO);

}
