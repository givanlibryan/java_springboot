package com.assignment.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.spring.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findAllByName(String name);

}
