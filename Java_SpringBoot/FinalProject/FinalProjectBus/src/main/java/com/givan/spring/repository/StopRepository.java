package com.givan.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.givan.spring.model.Stop;

public interface StopRepository extends JpaRepository<Stop, Long> {
	List<Stop> findByName(String name);

	List<Stop> findByCode(String code);
}
