package com.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.entity.Permission;
import com.management.repository.PermissionRepository;

@Service
public class PermissionService {

    private PermissionRepository permissionRepository;

    @Autowired
    public PermissionService(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    public Permission createPermission(Permission permission) {
        // Logic to create a new permission
        try {
            return permissionRepository.save(permission);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create permission", e);
        }
    }

    // Other service methods for permission management

    // Add additional methods as needed
}
