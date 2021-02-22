package com.product.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.catalog.model.Role;



public interface RoleRepository extends JpaRepository<Role, Long>{
}
