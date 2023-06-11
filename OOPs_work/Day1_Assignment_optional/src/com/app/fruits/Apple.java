package com.app.fruits;

public class Apple extends Fruit {
	public Apple(String color, double weight, String name) {
		super(color, weight, name);
		
	}
	public String taste() {
		return "Sweet n Sour";
	}
	
	public void jam() {
		System.out.println(getName()+"\nmaking a jam...\n"); 
	}
}
