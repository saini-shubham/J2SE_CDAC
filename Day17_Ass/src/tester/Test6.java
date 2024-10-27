package tester;
//6. Display student details from the map , 
//sorted as per student's roll no.
import static utils.StudentCollectionUtils.populateMap;
import static utils.StudentCollectionUtils.populateList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.core.Student;
public class Test6 {

	public static void main(String[] args) {
		//List<Student> list=
		List<Student> list=populateList();
		Map<String, Student> map = populateMap(list);
		map.values().stream().sorted((p1,p2)-> p1.getRollNo().compareTo(p2.getRollNo())).forEach(System.out::println);
		
	}

}
