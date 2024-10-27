package cloning_shallow_copy;

import cloning_deep_copy.Address;
import cloning_deep_copy.Student;

public class Test {

	public static void main(String[] args) throws Exception {
		Student s1 = new Student(100);
		Address a1 = new Address("pune");
		s1.setAdr(a1);
		System.out.println(s1);// 100 pune
		Student s2 = s1.clone(); //anotherStudent(clone) --> shallow copy: rollNo=100, adr pointing to earlier adr object
		System.out.println(s2);//100 pune
		System.out.println(s1 == s2); //false
		s1.setRollNo(200);//rollNo=200
		s1.getAdr().setCity("mumbai");
		System.out.println(s1);  //200 mumbai
		System.out.println(s2);//100 mumbai
	

	}

}
