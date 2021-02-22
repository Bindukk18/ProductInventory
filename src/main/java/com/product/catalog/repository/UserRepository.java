package com.product.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.catalog.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
