package com.educandoweb.courseaula308.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseaula308.entities.OrderItem;
import com.educandoweb.courseaula308.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
