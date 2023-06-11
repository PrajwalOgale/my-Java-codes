package com.app.fruits;

public class Mango extends Fruit{
	 
	public Mango(String color, double weight, String name) {
		super(color, weight, name);
	}
	public String taste() {
		return "Sweet";
	}
	
	public void pulp() {
		System.out.println("Name: "+getName()+"color: "+getColor()+"\ncreating pulp...\n");
	}
}
