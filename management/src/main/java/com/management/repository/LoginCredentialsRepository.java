package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.entity.LoginCredentials;

public interface LoginCredentialsRepository extends JpaRepository<LoginCredentials, Long> {

}
