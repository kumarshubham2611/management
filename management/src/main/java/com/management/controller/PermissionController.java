package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.management.entity.Permission;
import com.management.service.PermissionService;

@Controller
@RequestMapping("/permissions")
public class PermissionController {

    private PermissionService permissionService;

    @Autowired
    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @PostMapping
    public String createPermission(Permission permission) {
        
        permissionService.createPermission(permission);
        return "redirect:/permissions";
    }


}
