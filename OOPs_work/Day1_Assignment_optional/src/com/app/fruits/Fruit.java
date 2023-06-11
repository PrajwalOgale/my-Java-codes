package com.app.fruits;

public abstract class Fruit {
	private String color;
	private double weight;	
	private String name;
	private boolean fresh;
	
	
	public Fruit(String color, double weight, String name) {
		this.color= color;
		this.fresh = true;
		this.name = name;
		this.weight = weight;
	}			
	@Override
	public String toString() {
		return "Fruit is "+name+", color is "+color+", weight is "+weight+".\n";
	}
	public boolean isFresh() {
		return fresh;
	}
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	abstract public String taste(); //{
//		return "No specific taste.";
	//}

	public String getName(){
		return this.name;
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	
}
