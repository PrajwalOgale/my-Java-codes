package com.oragniser.app;

public class Student extends Person {
	private String course;
	

	Student(String firstName, String lastName, String course){
		super(firstName, lastName);
		this.course=course;
	}
	
	public String toString() {
		return "student info are "+super.toString()+" course is "+course;
	}

	public String study() {
		return "Studying";
	}
	
}
