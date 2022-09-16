package com.example.springbackend.dto;

import lombok.Data;

@Data
public class CreateCustomerDTO {
    private String firstName;
    private String lastName;
    private String email;
}