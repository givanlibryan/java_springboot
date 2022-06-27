package com.assignment.spring.controller;

import java.util.List;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.spring.model.Product;
import com.assignment.spring.repository.ProductRepository;
import com.assignment.spring.service.ProductService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/assignment")
public class ProductController {

	@Autowired
	private ProductRepository produkRepository;

	@Autowired
	private ProductService produkService;

	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return produkRepository.findAll();
	}

	@PostMapping("/products")
	public Product saveProducts(@RequestBody Product product) {
		return produkService.saveProduct(product);
	}

	@GetMapping("/products/name/{name}")
	public List<Product> findAllProductsByName(@PathVariable String name) {
		return produkService.findAllProductsByName(name);
	}

	@DeleteMapping("/products/id/{id}")
	public void deleteById(@PathVariable Long id) {
		produkService.deleteProductById(id);
	}

	@CrossOrigin
	@PutMapping("/products")
	public ResponseEntity<?> updateProductById(@RequestBody Product product, @RequestParam Long id) {

		try {
			Product checkProduct = produkService.findProductById(id);
			if (checkProduct.getId() != id) {
				return new ResponseEntity<>("ID Data produk tidak sesuai", HttpStatus.OK);
			}
			product.setId(id);
			produkService.saveProduct(product);

			// update from tb_product set name="Acer", hargaBeli=500, hargaJual=501
			// where id=?1

			return new ResponseEntity<>("Berhasil simpan produk", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("Terjadi kesalahan" + e.getMessage(), HttpStatus.OK);
		}
	}

}