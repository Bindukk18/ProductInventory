package com.product.catalog.repository;

import org.springframework.data.repository.CrudRepository;

import com.product.catalog.model.Product;



public interface ProductRepository extends CrudRepository<Product, Integer>{
}
