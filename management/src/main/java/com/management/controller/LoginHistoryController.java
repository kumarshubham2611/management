package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.management.entity.LoginHistory;
import com.management.service.LoginHistoryService;

@Controller
@RequestMapping("/loginHistory")
public class LoginHistoryController {

    private LoginHistoryService loginHistoryService;

    @Autowired
    public LoginHistoryController(LoginHistoryService loginHistoryService) {
        this.loginHistoryService = loginHistoryService;
    }

    @PostMapping
    public String createLoginHistory(LoginHistory loginHistory) {
       
        loginHistoryService.createLoginHistory(loginHistory);
        return "redirect:/loginHistory";
    }

}

