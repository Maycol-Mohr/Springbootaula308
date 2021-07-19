package com.educandoweb.courseaula308.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseaula308.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
