package com.oop.assignment.one;

public class Customer {
	private int ID;
	private String name;
	private String address;
	
	private static int count=0;
	
	public Customer(String name, String address) {
		this.ID=++count;
		this.name=name;
		this.address=address;
	}
	
	public String toString() {
		return "ID: "+ID+" name: "+name+" address: "+address;
	}
	
	public String getName() {
		return name;
	}
}
