
package tester;
import java.util.Scanner;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class EventOrganizerApp {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the capacity");
		
		//Create an array holding person type of reference that can refer to either Student or Faculty
		Person[] participants=new Person[sc.nextInt()];  
		int counter=0;
		boolean exit=false;
		while(!exit) {
			System.out.println("Options: 1)Register Student "
					+ "2)Register Faculty"
					+ "3) Display registered participants details "
					+ "4) Enter seat number"
					+"10)Exit");
			switch(sc.nextInt()) {
			case 1: if(counter<participants.length) {
					System.out.println("Enter student details: first name,last name ,year of passing, course taken, course fee, marks");
					participants[counter++]=new Student(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt());
					System.out.println("Student registered");
					}
					else System.out.println("Event full !!");
					break;

			case 2:if(counter<participants.length) {
						System.out.println("Enter faculty details: full name, last name, experience(in year), expertese");
						participants[counter++]=new Faculty(sc.next(),sc.next(),sc.nextInt(),sc.next());
						System.out.println("Faculty Registered");
						}
					else System.out.println("Event full!");
					break;
					
			case 3:
					System.out.println("Participant Details");   //can do it using for and for-each loop both
					//{s1,s2,f1,s2,s4,f2,f3,null,null}
					for(Person p:participants) {
						if(p!=null)						//otherwise it going to print ugly loooking null values
							System.out.println(p);
					}
					break;
				
			case 4: // {s1,s2,f1,s3,s4,f2,f3,null,null,null}
					System.out.println("Enter seat number");
					int index = sc.nextInt()-1;
					if(index >= 0 && index < counter) {
						Person person =participants[index];
						if(person instanceof Student) {
						// participants[index].study(); -->javac error
						//((Student)participants[index]).study(); 
						((Student) person).study();
					
						}
						else {
							// .teach();
							((Faculty)person).teach();
						}
					}
					
					break;
	
				
				
			case 10:exit=true;
				break;
			}
		}
		
		sc.close();
	}

}
