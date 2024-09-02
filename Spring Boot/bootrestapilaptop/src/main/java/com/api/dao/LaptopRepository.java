package com.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer>{
	
	public Laptop findById(int id);
}
