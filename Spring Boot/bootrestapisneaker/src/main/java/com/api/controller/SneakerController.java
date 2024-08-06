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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Sneaker;
import com.api.service.SneakerService;

@RestController
public class SneakerController {

	@Autowired
	private SneakerService sneakerService;
	
	//get all Sneaker
	@GetMapping("/sneakers")
	public ResponseEntity<List<Sneaker>> getAllSneaker() {
		List<Sneaker> list =  this.sneakerService.getAllSneaker();
		if(list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	//get single sneaker
	@GetMapping("/sneakers/{id}")
	public ResponseEntity<Sneaker> getSneakerById(@PathVariable int id) {
		Sneaker s =  this.sneakerService.getSneakerById(id);
		if(s == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(s));
	}
	
	//add new Sneaker
	@PostMapping("/sneakers")
	public ResponseEntity<Sneaker> addSneaker(@RequestBody Sneaker sneaker) {
		try {
			this.sneakerService.addSneaker(sneaker);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//update existing sneaker
	@PutMapping("/sneakers/{id}")
	public ResponseEntity<Sneaker> updateSneaker(@PathVariable int id, @RequestBody Sneaker sneaker) {
		try {
			this.sneakerService.updateSneaker(id, sneaker);
			return ResponseEntity.ok().body(sneaker);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//delete sneaker
	@DeleteMapping("/sneakers/{id}")
	public ResponseEntity<Void> deleteSneaker(@PathVariable int id) {
		try {
			this.sneakerService.deleteSneaker(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
