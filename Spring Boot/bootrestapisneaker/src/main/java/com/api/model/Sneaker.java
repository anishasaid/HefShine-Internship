package com.api.model;

public class Sneaker {
	
	private int id;
	private String sneakerName;
	private String sneakerHead;
	private int price;
	
	public Sneaker(int id, String sneakerName, String sneakerHead, int price) {
		super();
		this.id = id;
		this.sneakerName = sneakerName;
		this.sneakerHead = sneakerHead;
		this.price = price;
	}

	public Sneaker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSneakerName() {
		return sneakerName;
	}

	public void setSneakerName(String sneakerName) {
		this.sneakerName = sneakerName;
	}

	public String getSneakerHead() {
		return sneakerHead;
	}

	public void setSneakerHead(String sneakerHead) {
		this.sneakerHead = sneakerHead;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Sneaker [id=" + id + ", sneakerName=" + sneakerName + ", sneakerHead=" + sneakerHead + ", price="
				+ price + "]";
	}
	
	
	
}
