package Stacks;

//import java.util.Scanner;

public class FixedStack implements Stack{
	protected int top;
	protected Customer[] customers; //customers is an instance variable-> m/m allocated on heap
	//add argument less ctor to initalize the customers array reference and top
	// Tip: here can also use non static intializer block to intialize top and customers array reference
	public FixedStack(){
		top=-1;
		customers=new Customer[STACK_SIZE];   //creates array
	}
	
	@Override
	public void push(Customer ref) {
		//ifFull
		if(top==STACK_SIZE-1)
			System.out.println("Sorry!! Stack is full");
		else	
			customers[++top]=ref;
		}
	
	@Override
	public Customer pop() {
		//if empty
		if(top==-1) {
			System.out.println("Sorry!! Stack is empty");
			return null;
		}
		else
			return customers[top--];
	}
	
}
