package com.oop.assignment.one;

public class GrowableStack extends FixedStack {
//	private int index;
	private int size;
//	private Customer[] custs;
	
	public GrowableStack() {
		this.size=STACK_SIZE;
//		this.index=-1;
//		custs = new Customer[size];
	}
	
	@Override
	public void push(Customer c) {
		if(getIndex()<size-1) {			
		setIndex(getIndex()+1);;
		getCusts()[getIndex()]= c; 
		return;
		}else {
			
		int newSize = size*2;
		Customer[] temp = new Customer[newSize];
		for(int i=0; i<size; i++) {
			temp[i]=getCusts()[i];
		}
		setCusts(temp);
		temp=null;
		size=newSize;
		this.push(c);
		}
		
	}
//	public Customer pop() {
//		if(index==-1) {
//			System.out.println("Stack underflow.");
//			return null;
//		}
//		--index;
//		System.out.println("Removed.");
//		return custs[index+1];
//	}
	
}
