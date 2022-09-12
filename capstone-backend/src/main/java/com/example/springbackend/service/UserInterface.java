package com.example.springbackend.service;


import com.example.springbackend.model.User;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface UserInterface {
    ResponseEntity<Object> getAllUsers();

    void add(User user);

    Optional<User> getById(Long userId);
}
