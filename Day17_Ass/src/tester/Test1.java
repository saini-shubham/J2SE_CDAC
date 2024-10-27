package tester;

import static utils.StudentCollectionUtils.populateList;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;
public class Test1 {
	//try(Scanner sc=new Scanner(System.in)){
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		List<Student> student=populateList();
		//using lamda exp
		//student.stream().forEach(p -> System.out.println(p));
		
		//using method reference
		student.stream().forEach(System.out::println);
		
		//display all the details sorted as per GPA
		//student.stream().sorted((p1,p2)->(int)p1.getGpa().com
			
		
		//Write a tester to print average of  gpa of students for the specified subject
		System.out.println("Enter the subject ");
		Subject sub = Subject.valueOf(sc.next().toUpperCase());
		OptionalDouble average=student.stream().filter(p-> p.getSubject()== sub).mapToDouble(p->p.getGpa()).average();
		if(average.isPresent())
			System.out.println("Average GPA: "+ average);
		else
			System.out.println("No subject");
		
		

	
	}
	}


