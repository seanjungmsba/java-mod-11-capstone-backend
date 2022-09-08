package com.example.springbackend.repository;

import com.example.springbackend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // executes `SELECT * FROM Customers c WHERE c.email = theEmailAddress;`
    Customer findByEmail(String theEmailAddress);
}
