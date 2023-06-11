package com.app.fruits;

public class Orange extends Fruit{
	public Orange(String color, double weight, String name) {
		super(color, weight, name);
	}
	
	public String taste() {
		return "Sour";
	}
	
	public void juice() {
		System.out.println("name: "+getName()+" weight: "+getWeight()+"\nextracting juice!...\n");
	}
}
