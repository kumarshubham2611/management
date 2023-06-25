package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
   
}

