package Entities;

import Abstracts.IEntity;

public class Game implements IEntity{
	
	private int id;
	private String name;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0) {
			System.out.println("Fiyat olarak minimum 0 olabilir!");
			this.price = 0;
		}else {
			this.price = price;
		}
		
	}
}
