package com.example.websocketdemo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.websocketdemo.model.User;
import com.example.websocketdemo.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
