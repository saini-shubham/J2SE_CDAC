package tester;

import java.util.Scanner;

import Stacks.Customer;
import Stacks.FixedStack;
import Stacks.GrowableStack;
import Stacks.Stack;


public class tester2 {
	public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
	boolean exit=false;
	Stack ref=null;  //declare i/f type of reference, i/f reference can't be instantiated  
					
	while(!exit) {
		System.out.println("1) Choose Fixed Stack"
				+ "2) Choose Growable Stack"
				+ "3) Push Data"
				+ "4) Pop Data"
				+ "5) Exit");
		switch(sc.nextInt()) {
		case 1: 
			if(ref==null) //it means stack not choosen
				ref = new FixedStack();   //upcasting
			else
				System.out.println("Can not switch Stack type");
			break;
		case 2: 
			if(ref==null) {
			ref =new GrowableStack();}
			else
				System.out.println("Can not switch Stack type");

			break;
		case 3: 
			if(ref!= null) // it means stack is choosen
			{
			System.out.println("Enter the Id,name and address");
			Customer c =new Customer(sc.nextInt(),sc.next(),sc.next());
			//instance of checking is not required -> JVM will figure it out
			ref.push(c);
			}
			else
				System.out.println("choose type of stack first");
		case 4: 
			if(ref!= null) {
			System.out.println("Enter the Id,name and address");
			Customer c =ref.pop();
			if(c!=null) 
				System.out.println("Customer details"+c);  //c.toString
			}
			else
				System.out.println("Choose type of stack first");
			break;
		case 5:
				exit =true;
				break;
		
		}
		}
	}
	}	
	}
	
