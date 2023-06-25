package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.management.entity.LoginCredentials;
import com.management.service.LoginCredentialsService;

@Controller
@RequestMapping("/loginCredentials")
public class LoginCredentialsController {

    private LoginCredentialsService loginCredentialsService;

    @Autowired
    public LoginCredentialsController(LoginCredentialsService loginCredentialsService) {
        this.loginCredentialsService = loginCredentialsService;
    }

    @PostMapping
    public String createLoginCredentials(LoginCredentials loginCredentials) {
        loginCredentialsService.createLoginCredentials(loginCredentials);
        return "redirect:/loginCredentials";
    }
    
}

