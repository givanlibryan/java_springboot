package com.assignment.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_product")
public class Product {
	private int id;
	private String namaBarang;
	private Long hargaBeli;
	private Long hargaJual;	

	public Product() {

	}
	
	public Product(int id, String namaBarang, Long hargaBeli, Long hargaJual) {
		this.id = id;
		this.namaBarang = namaBarang;
		this.hargaBeli = hargaBeli;
		this.hargaJual = hargaJual;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public Long getHargaBeli() {
		return hargaBeli;
	}

	public void setHargaBeli(Long hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

	public Long getHargaJual() {
		return hargaJual;
	}

	public void setHargaJual(Long hargaJual) {
		this.hargaJual = hargaJual;
	}	
}