package com.oop.assignment.one;

public class FixedStack implements Stack{
	private int index;
	private Customer[] custs;
	
	public FixedStack() {
		this.index=-1;
		custs = new Customer[STACK_SIZE];
	}
	
	public void push(Customer c) {
		if(index==STACK_SIZE-1) {		
			System.out.println("Stack overflow.");
		}
		else {			
			index++;
			custs[index]= c;		
		}
	}
	public Customer pop() {
		if(index==-1) {
			System.out.println("Stack underflow.");
			return null;
		}
		--index;
		System.out.println("Removed.");
		return custs[index+1];
	}
}
