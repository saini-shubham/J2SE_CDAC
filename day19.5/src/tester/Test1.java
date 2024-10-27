package tester;
import static utils.StudentCollectionUtils.populateList;

import java.util.List;

import com.app.core.Student;
import java.util.List;

public class Test1 {
	public static void main(String [] main) {
		List<Student> list = populateList();
		System.out.println("Students:");
		list.forEach(System.out::println);
		//display phone number of all the students
		list.stream()
		.map(s->s.getAddress().getPhoneNo()).forEach(System.out::println);
	}
	

}
