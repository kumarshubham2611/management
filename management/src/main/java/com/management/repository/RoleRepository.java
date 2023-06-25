package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // Additional custom queries if needed
}
