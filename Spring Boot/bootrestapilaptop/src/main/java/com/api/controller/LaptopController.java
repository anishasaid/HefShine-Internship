package com.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Laptop;
import com.api.services.LaptopService;

@RestController
public class LaptopController {

	@Autowired
	private LaptopService laptopService;
	
	@GetMapping("/laptops/{id}")
	public ResponseEntity<Laptop> getLaptopById(@PathVariable int id) {
		Laptop laptop = this.laptopService.getLaptopById(id);

		if(laptop == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.of(Optional.of(laptop));
	}
	
	@GetMapping("/laptops")
	public ResponseEntity<List<Laptop>> getAllLaptop(){
		List<Laptop> list =  this.laptopService.getAllLaptop();
		if(list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@PostMapping("/laptops")
	public ResponseEntity<Laptop> addLaptop(@RequestBody Laptop laptop) {
		Laptop l = null;
		try {
			 l = this.laptopService.addLaptop(laptop);
			 return ResponseEntity.status(HttpStatus.CREATED).build();
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PutMapping("/laptops/{id}")
	public ResponseEntity<Laptop> updateLaptop(@PathVariable int id, @RequestBody Laptop laptop) {
		try {
		  this.laptopService.updateLaptop(id, laptop);
		  return ResponseEntity.ok().body(laptop);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		  
	}
	
	@DeleteMapping("/laptops/{id}")
	public ResponseEntity<Void> deleteLaptop(@PathVariable int id) {
		try {
			this.laptopService.deleteLaptop(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
