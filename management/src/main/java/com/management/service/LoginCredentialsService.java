package com.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.entity.LoginCredentials;
import com.management.repository.LoginCredentialsRepository;

@Service
public class LoginCredentialsService {

    private LoginCredentialsRepository loginCredentialsRepository;

    @Autowired
    public LoginCredentialsService(LoginCredentialsRepository loginCredentialsRepository) {
        this.loginCredentialsRepository = loginCredentialsRepository;
    }

    public LoginCredentials createLoginCredentials(LoginCredentials loginCredentials) {
        
        try {
            return loginCredentialsRepository.save(loginCredentials);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create login credentials", e);
        }
    }

    
}
