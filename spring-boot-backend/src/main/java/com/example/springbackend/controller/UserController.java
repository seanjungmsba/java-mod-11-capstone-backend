package com.example.springbackend.controller;

import com.example.springbackend.model.User;
import com.example.springbackend.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// reference: https://www.baeldung.com/spring-response-entity
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserInterface userService;

    @RequestMapping(value ="/getAll", method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @RequestMapping(value ="/getById", method = RequestMethod.GET)
    public ResponseEntity<?> getById(@RequestParam Long userId) {
        return ResponseEntity.ok(userService.getById(userId).get());
    }

    @PostMapping(value ="/add")
    public ResponseEntity<?> save(@RequestBody User user) {
        userService.add(user);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value ="/update")
    public ResponseEntity<?> update(@RequestBody User user) {
        userService.add(user);
        return ResponseEntity.ok().build();
    }
}
