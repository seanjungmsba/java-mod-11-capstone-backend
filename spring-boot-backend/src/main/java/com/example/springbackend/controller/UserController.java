package com.example.springbackend.controller;

import com.example.springbackend.exception.NotFoundException;
import com.example.springbackend.exception.ValidationException;
import com.example.springbackend.model.User;
import com.example.springbackend.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

// reference: https://www.baeldung.com/spring-response-entity
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserInterface userService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsers() {
        try {
            return ResponseEntity.ok(userService.getAllUsers());
        } catch (NotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", e);
        }
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public ResponseEntity<?> getById(@RequestParam Long userId) {
        try {
            return ResponseEntity.ok(userService.getById(userId).get());
        } catch (NotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", e);
        }
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> save(@RequestBody User user) {
        try {
            userService.add(user);
        } catch (ValidationException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE, "User Not Found", e);
        }

        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/update")
    public ResponseEntity<?> update(@RequestBody User user) {
        try {
            userService.add(user);
        } catch (ValidationException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE, "User Not Found", e);
        }

        return ResponseEntity.ok().build();
    }
}