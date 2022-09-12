package com.example.springbackend.service;

import com.example.springbackend.model.Role;
import com.example.springbackend.model.User;
import com.example.springbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserInterface {
    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<Object> getAllUsers() {
        List<User> dbUsers = userRepository.findAll();
        if (dbUsers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(dbUsers, HttpStatus.OK);
    }

    @Override
    public void add(User user) {

        if (user.getId() != null) {
            Optional<User> _user = getById(user.getId());
            _user.ifPresent(value -> user.setId(value.getId()));
        }

        Role role = new Role();
        role.setId(1L);
        List<Role> roles = Collections.singletonList(role);
        user.setRoles(roles);
        userRepository.save(user);
    }

    @Override
    public Optional<User> getById(Long userId) {
        return userRepository.findById(userId);
    }

}
