package com.example.springbackend.service;

import com.example.springbackend.model.Role;
import com.example.springbackend.model.User;
import com.example.springbackend.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    /**
     * Method under test: {@link UserService#getAllUsers()}
     */
    @Test
    void testGetAllUsers() {
        when(userRepository.findAll()).thenReturn(new ArrayList<>());
        ResponseEntity<Object> actualAllUsers = userService.getAllUsers();
        assertNull(actualAllUsers.getBody());
        assertEquals(HttpStatus.NOT_FOUND, actualAllUsers.getStatusCode());
        assertTrue(actualAllUsers.getHeaders().isEmpty());
        verify(userRepository).findAll();
    }

    /**
     * Method under test: {@link UserService#getAllUsers()}
     */
    @Test
    void testGetAllUsers1() {
        User user = new User();
        user.setEmail("jane.doe@example.org");
        user.setEmailVerified(true);
        user.setFamilyName("Family Name");
        user.setGivenName("Given Name");
        user.setId(123L);
        user.setLocale("en");
        user.setName("Name");
        user.setPreferredUsername("janedoe");
        user.setRoles(new ArrayList<>());
        user.setZoneInfo("Zone Info");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(user);
        when(userRepository.findAll()).thenReturn(userList);
        ResponseEntity<Object> actualAllUsers = userService.getAllUsers();
        assertTrue(actualAllUsers.hasBody());
        assertEquals(HttpStatus.OK, actualAllUsers.getStatusCode());
        assertTrue(actualAllUsers.getHeaders().isEmpty());
        verify(userRepository).findAll();
    }

    /**
     * Method under test: {@link UserService#add(User)}
     */
    @Test
    void testAdd() {
        User user = new User();
        user.setEmail("jane.doe@example.org");
        user.setEmailVerified(true);
        user.setFamilyName("Family Name");
        user.setGivenName("Given Name");
        user.setId(123L);
        user.setLocale("en");
        user.setName("Name");
        user.setPreferredUsername("janedoe");
        user.setRoles(new ArrayList<>());
        user.setZoneInfo("Zone Info");

        User user1 = new User();
        user1.setEmail("jane.doe@example.org");
        user1.setEmailVerified(true);
        user1.setFamilyName("Family Name");
        user1.setGivenName("Given Name");
        user1.setId(123L);
        user1.setLocale("en");
        user1.setName("Name");
        user1.setPreferredUsername("janedoe");
        user1.setRoles(new ArrayList<>());
        user1.setZoneInfo("Zone Info");
        Optional<User> ofResult = Optional.of(user1);
        when(userRepository.save(any())).thenReturn(user);
        when(userRepository.findById(any())).thenReturn(ofResult);

        User user2 = new User();
        user2.setEmail("jane.doe@example.org");
        user2.setEmailVerified(true);
        user2.setFamilyName("Family Name");
        user2.setGivenName("Given Name");
        user2.setId(123L);
        user2.setLocale("en");
        user2.setName("Name");
        user2.setPreferredUsername("janedoe");
        user2.setRoles(new ArrayList<>());
        user2.setZoneInfo("Zone Info");
        userService.add(user2);
        verify(userRepository).save(any());
        verify(userRepository).findById(any());
        Collection<Role> roles = user2.getRoles();
        assertEquals(1, roles.size());
        assertEquals(123L, user2.getId().longValue());
        assertEquals(1L, ((List<Role>) roles).get(0).getId().longValue());
    }

    /**
     * Method under test: {@link UserService#getById(Long)}
     */
    @Test
    void testGetById() {
        User user = new User();
        user.setEmail("jane.doe@example.org");
        user.setEmailVerified(true);
        user.setFamilyName("Family Name");
        user.setGivenName("Given Name");
        user.setId(123L);
        user.setLocale("en");
        user.setName("Name");
        user.setPreferredUsername("janedoe");
        user.setRoles(new ArrayList<>());
        user.setZoneInfo("Zone Info");
        Optional<User> ofResult = Optional.of(user);
        when(userRepository.findById(any())).thenReturn(ofResult);
        Optional<User> actualById = userService.getById(123L);
        assertSame(ofResult, actualById);
        assertTrue(actualById.isPresent());
        verify(userRepository).findById(any());
    }

}