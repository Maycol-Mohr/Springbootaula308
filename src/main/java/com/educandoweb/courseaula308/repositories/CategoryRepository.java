package com.educandoweb.courseaula308.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseaula308.entities.Category;
import com.educandoweb.courseaula308.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
