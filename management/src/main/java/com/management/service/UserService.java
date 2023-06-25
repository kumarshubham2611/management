package com.management.service;



import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.entity.User;
import com.management.repository.UserRepository;

@Service
public class UserService {

    private static final Logger LOGGER = LogManager.getLogger(UserService.class);

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        try {
            User createdUser = userRepository.save(user);
            LOGGER.info("User created: " + createdUser);
            return createdUser;
        } catch (Exception e) {
            LOGGER.error("Failed to create user", e);
            throw new RuntimeException("Failed to create user", e);
        }
    }

    public User getUserById(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            LOGGER.warn("User not found for ID: " + id);
        }
        return user;
    }

    public void updateUser(Long id, User updatedUser) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
            userRepository.save(user);
            LOGGER.info("User updated: " + user);
        } else {
            LOGGER.warn("User not found for ID: " + id);
        }
    }

	/*
	 * public void deleteUser(Long id) { userRepository.deleteById(id);
	 * LOGGER.info("User deleted with ID: " + id); }
	 */
    public void deleteUser(Long id) {
        
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found"));


        userRepository.delete(user);
    }
    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


	
    
}
