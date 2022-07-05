package com.assignment.spring.service;

import java.util.List;

import com.assignment.spring.model.Product;


public interface ProductService {

	List<Product> findAllProducts(); // menampilkan semua product

	List<Product> findAllProductsByName(String name); // mencari product bedasarkan nama
	// select * from tb_product where name = ?1
	// select * from tb_product where name = ?1 and harga = ?2

	Product findProductById(Long id);

	Product saveProduct(Product product);

	void deleteProductById(Long id);
	

}
