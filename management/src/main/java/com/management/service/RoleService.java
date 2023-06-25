package com.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.entity.Role;
import com.management.repository.RoleRepository;

@Service
public class RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(Role role) {
        // Logic to create a new role
        try {
            return roleRepository.save(role);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create role", e);
        }
    }

    
}

