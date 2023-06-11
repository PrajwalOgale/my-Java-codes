package com.oop.assignment.one;

public class Customer {
	private int ID;
	private String name;
	private String address;

	public Customer(int ID,	String name, String address) {
		this.ID=ID;
		this.name=name;
		this.address=address;
	}

	public String toString() {
		return "ID: " + ID + " name: " + name + " address: " + address;
	}

	public String getName() {
		return name;
	}
}
