package com.educandoweb.courseaula308.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseaula308.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
