 package tester;
import static utils.CustomerUtils.authenticateCustomer;
import static utils.CustomerUtils.findByPk;
import static utils.CustomerUtils.populateCustomerList;
import static utils.CustomerUtils.updatePassword;
import static utils.CustomerValidationRules.validateAllInputs;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.core.ServicePackage;
import static utils.CustomerValidationRules.snrDate;

public class tester1 {
	public static void main(String[] args) throws ParseException {
		
		try(Scanner sc=new Scanner(System.in)){
			ArrayList<Customer> customers=populateCustomerList();
			boolean flag=false;
			while(!flag) {
				System.out.println("1)Customer Registration"
						+ "2)Custommer Login "
						+ "3)Link Adhaar Card"
						+ "4) Display customer details"
						+ "5)Change Password"
						+ "6)Unsubscribe a customer"
						+ "7)Upgrade all senior citizen"
						+ "10) Exit");
			try {
				switch(sc.nextInt()){
				case 1:
					System.out.println("Customer registration");
					//System.out.println("Enter: String name, String email, String password,double regAmount ,Date dob,ServicePackage plan");
					Customer customer=validateAllInputs(sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(), customers);
					customers.add(customer);
					System.out.println("Regitered successfully");
					
					break;
				case 2: 
					System.out.println("Customer Login");
					System.out.println("Enter email,DOB(dd-MM-YY) and Password ");
					Customer authenticateCustomer = authenticateCustomer(sc.next(), sc.next(), sc.next(), customers);
					System.out.println("Customer login successful,Hello"+authenticateCustomer.getName());
					break;
					
				case 3:
					System.out.println("Enter email,dob ");
					Customer anotherCustomer=findByPk(sc.next(), sc.next(), customers);
					//if ctrl reaches here -> valid PK -> link adhar
					anotherCustomer.linkAdhar(sc.next(),sc.next());
					System.out.println("Customer Name:"+anotherCustomer.getName() +"Adhhar linked succesfully");
					break;
					
				case 4:
					
					System.out.println("Customer Details");   //using itterator to itterate over list.  You can use for, for-each 
					Iterator<Customer> itr=customers.iterator();
					while(itr.hasNext())
						System.out.println(itr.next());
					System.out.println("Enter email,dob ,password, and new password");
					//updatePassword(sc.next(), sdf.parse(sc.next()), sc.next(), customers, sc.next());
					//System.out.println(authenticateCustomer(sc.next(), sc.next(), customers ));
					
					
					
					
					break;
				case 5:  //change password
					System.out.println("Enter email,dob ,password, and new password");
					//authenticateCustomer(sc.next(), sc.next(), sc.next(),sc.next() ,customers);
					updatePassword(sc.next(), sc.next(), sc.next(),sc.next() ,customers);
					break;
				case 6:
					System.out.println("Enter email and dob ");
					anotherCustomer= findByPk(sc.next(), sc.next(), customers);
					//if ctrl reaches here -> customer found -> unsubsribe cust
					System.out.println("Unsubcribes succesffully"+customers.remove(anotherCustomer));
					break;
				case 7:
					for(Customer c: customers)
						if(c.getDob().before(snrDate) && c.getPlan()==ServicePackage.DIAMOND){
							c.setPlan(ServicePackage.PLATINUM);
							c.setRegAmount(ServicePackage.PLATINUM.getRegAmount());	
						}
						break;
				
				
				
				case 10: flag=true;
							break;
				
				
				
			
			}sc.nextLine();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			sc.nextLine();		//read off all pending inputs from the scanner till new line
				
				
			}
			
			}
		
		}
	}


