package com.app.tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Basket: ");
		Fruit[] fruit = new Fruit[sc.nextInt()];
		int count=0;
		boolean isExit=false;
		
		while(!isExit) {
			System.out.println("1. Add Mango\n2. Add Apple\n3. Add Orange\n4. Display names of all fruits in the Basket\n"
					+ "5. Display names, color, weight, taste of all fresh fruits\n6. Mark a fruit in a basket, as stale\n"
					+ "7. Mark all sour fruits stale\n8. Invoke fruit specific functionality (pulp / juice/ jam)\n"
//					+ "9. Invoke correct functionality (pulp / juice/ jam)\n"
					+ "10. Exit.");
			System.out.println("Enter your choice: ");

			int choice=sc.nextInt();
			
			
			switch (choice) {
			case 1:
				if(fruit.length<=count) {
					System.out.println("Basket is Full..");
					break;
				}
				System.out.println("Enter the following details:\ncolor,weight\n");
				
				fruit[count++]=new Mango(sc.next(), sc.nextDouble(), "Mango");
				System.out.println("Mango added.\n");
				break;
			case 2:
				if(fruit.length<=count) {
					System.out.println("Basket is Full..");
					break;
				}
				System.out.println("Enter the following details:\ncolor,weight\n");
				
				fruit[count++]=new Apple(sc.next(), sc.nextDouble(), "Apple");
				System.out.println("Apple added.\n");
				break;
			case 3:
				if(fruit.length<=count) {
					System.out.println("Basket is Full..");
					break;
				}
				System.out.println("Enter the following details:\ncolor,weight\n");
				
				fruit[count++]=new Orange(sc.next(), sc.nextDouble(), "Orange");
				System.out.println("Orange added.\n");
				break;
			case 4:
				for(int i=0; i<=count-1;i++) {
					System.out.println(fruit[i].getName());
				}
				break;
			case 5:
				for(int i=0; i<count;i++) {
					if(fruit[i].isFresh()) {
						System.out.println(fruit[i]+fruit[i].taste());
					}
				}
				break;
			case 6:
				System.out.println("Enter fruit number: ");
				int i=sc.nextInt();
				if(i>count) {
					System.out.println("Fruit number is invalid.");
					break;
				}
				fruit[i-1].setFresh(false);
				System.out.println("Mark as stale");
				break;
				
			case 7:
				for(int j=0; j<count;j++) {
					if (fruit[j].taste().equals("Sour")) {
						fruit[j].setFresh(false);
					}
				}
				System.out.println("All sour fruits mark as stale.");
				break;
			case 8:
				System.out.println("Enter the fruit index to invoke functionality: ");
				int j=sc.nextInt()-1;
				if(j>=count) {
					System.out.println("Invalid Index.");
					break;
				}
				if(fruit[j].getName()=="Mango") {
					((Mango)fruit[j]).pulp();
				}else if(fruit[j].getName()=="Apple") {
					((Apple)fruit[j]).jam();
				}else {
					((Orange)fruit[j]).juice();
				}
				break;	
				
//			case 9:
//				System.out.println("Enter the fruit index to invoke functionality: ");
//				int j=sc.nextInt();
//				if(j>count) {
//					System.out.println("Invalid Index.");
//					break;
//				}
//				if(fruit[j].getName()=="Mango") {
//					((Mango)fruit[j]).pulp();
//				}else if(fruit[j].getName()=="Apple") {
//					((Apple)fruit[j]).jam();
//				}else {
//					((Orange)fruit[j]).juice();
//				}
//				break;	
				
			case 10:
				isExit=true;
				System.out.println("Thank You!.");
				break;			
			}
		}
		sc.close();
		
	}

}
