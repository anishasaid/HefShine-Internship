package com.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.dao.LaptopRepository;
import com.api.model.Laptop;

@Component
public class LaptopService {

	@Autowired
	private LaptopRepository laptopRepo;
	
	public Laptop getLaptopById(int id) {
		
		Laptop laptop = null;
		try {
			laptop =  this.laptopRepo.findById(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return laptop;
	}
	
	public List<Laptop> getAllLaptop(){
		return this.laptopRepo.findAll();
	}
	
	public Laptop addLaptop(Laptop laptop) {
		Laptop lp =  this.laptopRepo.save(laptop);
		return lp;
	}
	
	public void updateLaptop(int id, Laptop laptop) {
		laptop.setId(id);
		this.laptopRepo.save(laptop);
	}
	
	public void deleteLaptop(int id) {
		this.laptopRepo.deleteById(id);
	}
}
