package com.oop.assignment.one;

import java.util.Scanner;


public class TesterStack {

	public static void main(String[] args) {
		Stack s=null;
		boolean isExit=false;
		Scanner sc=new Scanner(System.in);
		while(!isExit) {
		System.out.println("Choose Option\n1.choose Fixed Stack\n2.choose Growable Stack\n3.push data\n4.Pop data\n5.Exit");
		int choice=sc.nextInt();
		
				switch (choice) {
				case 1:
					if(s!=null) {
						System.out.println("Stack already chosen.");
						break;
					}
					s=new FixedStack();
					System.out.println("Fixed Stack created.");
					break;
				case 2:
					if(s!=null) {
						System.out.println("Stack already chosen.");
						break;
					}
					s=new GrowableStack();
					System.out.println("Growable Stack created.");
					break;
				case 3:
					if(s==null) {
						System.out.println("No stack choosen.");
						break;
					}
					System.out.println("Enter the details (name,address): ");
					Customer c=new Customer(sc.next(), sc.next());
					s.push(c);
					System.out.println("Customer details pushed.\n");
					break;
				case 4:
					if(s==null) {
						System.out.println("No stack choosen.\n");
						break;
					}
//					if(s.pop()==null)break;
					System.out.println(s.pop()+"\n");
					break;
				case 5:
					isExit=true;
					System.out.println("Exit. Thank You!\n");
					break;
				}
			
		}
		sc.close();
	}

}
