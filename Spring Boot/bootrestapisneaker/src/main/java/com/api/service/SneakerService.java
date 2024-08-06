package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.model.Sneaker;

@Component
public class SneakerService {
	
	private static List<Sneaker> list = new ArrayList<>();
	
	static {
		list.add(new Sneaker(1, "Vendoz Women Casual Shoes", "Anisha", 619));
		list.add(new Sneaker(2, "Puma Unisex Adult Smashic", "Apeksha", 2469));
		list.add(new Sneaker(3, "ASIAN Mens TARZAN-11", "Pritam", 729));
		list.add(new Sneaker(4, "Sparx Mens Sd0734g", "Shradhha", 721));
		list.add(new Sneaker(5, "TRACES Stylish Trendy", "Maithilee", 735));
		list.add(new Sneaker(6, "Vendoz Women White Casual Shoes", "Anisha", 599));
		list.add(new Sneaker(7, "Red Tape Casual Shoes", "Anisha", 1589));
	}
	
	public List<Sneaker> getAllSneaker() {
		return list;
	}

	public Sneaker getSneakerById(int id) {
		Sneaker s = null;
		try {
			s = list.stream().filter(sneaker->sneaker.getId() == id).findFirst().get();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	//add new sneaker
	public Sneaker addSneaker(Sneaker sneaker) {
		list.add(sneaker);
		return sneaker;
	}
	
	public void updateSneaker(int id, Sneaker sneaker) {
		list = list.stream().map(s->{
			if(s.getId() == id) {
				s.setSneakerName(sneaker.getSneakerName());
				s.setSneakerHead(sneaker.getSneakerHead());
				s.setPrice(sneaker.getPrice());
			}
			return s;
		}).collect(Collectors.toList());
	}
	
	public void deleteSneaker(int id) {
		list = list.stream().filter(s->{
			if(s.getId() != id) {
				return true;
			}else{
				return false;
			}
		}).collect(Collectors.toList());
	}
}
