package tester;
//7. Display student details from the map , sorted as per student's gpa.

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.List;
import java.util.Map;

import com.app.core.Student;

import utils.StudentCollectionUtils;

public class Test7 {

	public static void main(String[] args) {
		List<Student> list=populateList();
		Map<String,Student> map = populateMap(list);
		map.values().stream().mapToDouble(p-> p.getGpa()).sorted().forEach(System.out::println);


	}

}
