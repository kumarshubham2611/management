package com.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.entity.LoginHistory;
import com.management.repository.LoginHistoryRepository;

@Service
public class LoginHistoryService {

    private LoginHistoryRepository loginHistoryRepository;

    @Autowired
    public LoginHistoryService(LoginHistoryRepository loginHistoryRepository) {
        this.loginHistoryRepository = loginHistoryRepository;
    }

    public LoginHistory createLoginHistory(LoginHistory loginHistory) {
        // Logic to create login history
        try {
            return loginHistoryRepository.save(loginHistory);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create login history", e);
        }
    }
    public LoginHistory getLoginHistoryById(Long id) {
        return loginHistoryRepository.findById(id).orElse(null);
    }

    public void updateLoginHistory(Long id, LoginHistory updatedLoginHistory) {
        LoginHistory loginHistory = loginHistoryRepository.findById(id).orElse(null);
        if (loginHistory != null) {
            loginHistory.setUser(updatedLoginHistory.getUser());
            loginHistory.setLoginTime(updatedLoginHistory.getLoginTime());
            loginHistoryRepository.save(loginHistory);
        }
    }
    
    public void deleteLoginHistory(Long id) {
        loginHistoryRepository.deleteById(id);
    }
    
    

    // Other service methods for login history management

    // Add additional methods as needed
}
