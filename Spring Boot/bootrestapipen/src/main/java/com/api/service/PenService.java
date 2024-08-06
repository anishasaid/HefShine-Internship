package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.model.Pen;

@Component
public class PenService {
	
	private static List<Pen> list = new ArrayList<Pen>();
	
	static {
		list.add(new Pen(2, "pilot", "Yello", 10));
		list.add(new Pen(3, "boll pen", "pink", 4));
		list.add(new Pen(5, "Marker", "red", 120));
		list.add(new Pen(6, "Nataraj", "purple", 10));
		list.add(new Pen(28, "Parker", "Black", 200));
		list.add(new Pen(14, "Montblanc", "green", 20));		
	}
	
	//get all pens
	public List<Pen> getAllPens() {
		return list;
	}
	
	//get single pen
	public Pen getPenById(int Pid) {
		Pen pen = new Pen();
		pen = list.stream().filter(p->p.getId() == Pid).findFirst().get();
		return pen;
	}
	
	public Pen addPenn(Pen pen) {
		list.add(pen);
		return pen;
	}
	
	public void updatePen(int id, Pen pen) {
		list = list.stream().map(p->{
			if(p.getId() == id) {
				p.setName(pen.getName());
				p.setColor(pen.getColor());
				p.setPrice(pen.getPrice());
			}
			return p;
		}).collect(Collectors.toList());
		
	}
	
	public void deletePen(int id) {
		list = list.stream().filter(p->{
			if(p.getId() != id) {
				return true;
			}else {
				return false;
			}
		}).collect(Collectors.toList());
		
	}
}
