package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Pen;
import com.api.service.PenService;

@RestController
public class PenController {

	@Autowired
	private PenService penService;
	
	@GetMapping("/pens")
	public List<Pen> getAllPens() {
		return this.penService.getAllPens();
	}
	
	@GetMapping("/pens/{Pid}")
	public Pen getPenById(@PathVariable int Pid) {
		return this.penService.getPenById(Pid);
	}
	
	@PostMapping("/pens")
	public Pen addPen(@RequestBody Pen pen) {
		return this.penService.addPenn(pen);
	}
	
	@PutMapping("/pens/{id}")
	public Pen updatePen(@PathVariable int id, @RequestBody Pen pen) {
		this.penService.updatePen(id, pen);
		return pen;
	}
	
	@DeleteMapping("/pens/{id}")
	public void deletePen(@PathVariable int id) {
		this.penService.deletePen(id);
	}
}
