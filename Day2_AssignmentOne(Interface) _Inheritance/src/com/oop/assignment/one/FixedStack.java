package com.oop.assignment.one;

//import com.oop.assignment.validation.Validation;

public class FixedStack implements Stack{
	private int index;	
	private Customer[] custs;

	public FixedStack() {
		this.index=-1;
		custs = new Customer[STACK_SIZE];
	}
	@Override
	public void push(Customer c) {
		if(index==STACK_SIZE-1) {		
			System.out.println("Stack overflow.");
		}
		else {			
			index++;
			custs[index]= c;
			System.out.println("Customer details pushed.\n");
		}
	}
	
	public Customer pop() {
		if(index!=-1) {
			System.out.println("Removed.");
			return custs[index--];
		}
		System.out.println("Stack underflow.");
		return null;
		
	}

	public void display(){
		for(Customer c:custs){
			System.out.println(c);
		}
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public Customer[] getCusts() {
		return custs;
	}

	public void setCusts(Customer[] custs) {
		this.custs = custs;
	}
}
