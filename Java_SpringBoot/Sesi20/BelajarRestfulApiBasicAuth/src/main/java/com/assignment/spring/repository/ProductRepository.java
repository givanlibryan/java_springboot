package com.assignment.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.spring.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}
