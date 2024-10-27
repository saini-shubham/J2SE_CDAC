package tester;
import static utils.StudentCollectionUtils.populateList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.app.core.Student;
import java.util.List;

public class Test2 {
	public static void main(String [] main) {
		List<Student> list = populateList();
		System.out.println("Students:");
		list.forEach(System.out::println);
		System.out.println("Hobbies:");
		//display hobbies of all the students
		list.stream()
		.flatMap(s-> s.getHobbies().stream())		//1 to many mapping => use flatMap
		.collect(Collectors.toSet())				//collecting in set to avoid duplicates
		.forEach(System.out::println);
	}
	

}
