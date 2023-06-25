package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.management.entity.Role;
import com.management.service.RoleService;

@Controller
@RequestMapping("/roles")
public class RoleController {

    private RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping
    public String createRole(Role role) {
        
        roleService.createRole(role);
        return "redirect:/roles";
    }
    
    
}
