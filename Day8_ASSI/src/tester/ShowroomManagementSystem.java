package tester;

import java.util.Scanner;

import com.app.core.Vehicle;

import cust_exception.VehicleValidationException;

public class ShowroomManagementSystem {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter the capacity of showroom");
			Vehicle[] vehicles=new Vehicle[sc.nextInt()];
			int counter=0;
			boolean exit=false;
			while(!exit) {
				System.out.println("1) Enter vehicle details 2)show showroom details 10)Exit");
				try {
				switch(sc.nextInt()) {
				case 1: 
					if(counter<vehicles.length) {
						System.out.println("Enter vehicle details : chasisNo,  color,  price,  manufactureDate");
						 Vehicle vehicle = validateAllInputs(sc.next(),sc.next(),sc.nextDouble(),sc.next(),vehicles);
						 vehicles[counter++]=vehicle;
					}
					else
						throw new VehicleValidationException("Showroom capacity full");
						break;
				case 2:
					System.out.println("Showroom information");
					for(Vehicle v: vehicles)
						if(v!=null)
							System.out.println(v);
					break;
				case 10:
					exit=true;
					break;
					}
				}
				catch(Exception e) {
					e.printStackTrace();
					
				}
				}
			}
			
			
		}

	private static Vehicle validateAllInputs(String next, String next2, double nextDouble, String next3,
			Vehicle[] vehicles) {
		// TODO Auto-generated method stub
		return null;
	}
		
		
		
	}


