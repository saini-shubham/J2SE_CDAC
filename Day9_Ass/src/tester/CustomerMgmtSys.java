package tester;

import java.util.Scanner;

import com.app.core.Customer;

import cust_excp.CustomerValidationException;
import utils.CustomerValidationRules;

import static utils.CustomerValidationRules.validateAllInputs;
public class CustomerMgmtSys {

	public static void main(String[] args){
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the capacity");
			Customer[] customers=new Customer[sc.nextInt()];
			int counter =0;
			boolean exit =false;
			while(!exit) {
				System.out.println("Options : 1 . Add New Customer 2. Display showroom info 10.Exit");
				System.out.println("Choose option");
				try {
					switch(sc.nextInt()) {
					case 1:
						if(counter<customers.length) {
							System.out.println("Enter: String name, String email, String password,double regAmount , ,Date dob,ServicePackage plan");
							customers[counter++]=validateAllInputs(sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(), customers);
							}
						
						else throw new CustomerValidationException("Registration are full!!");
						break;
					case 2:
						break;
					case 10:
						break;
				
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		

	}

	
	

	

}
