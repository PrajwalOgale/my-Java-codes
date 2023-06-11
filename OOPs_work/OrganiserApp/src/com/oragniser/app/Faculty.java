package com.oragniser.app;

public class Faculty extends Person{
	private String sme;
	
	Faculty(String firstName,String lastName, String sme ){
		super(firstName, lastName);
		this.sme=sme;
	}
	
	public String toString() {
		return "Faculty is "+super.toString()+" sme is "+sme;
	}
	public String teach() {
		return "Teaching";
	}
	

}
