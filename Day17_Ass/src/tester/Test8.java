package tester;

import static utils.StudentCollectionUtils.populateList;

import java.util.List;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

//8. Print names  of first 3 specified subject  toppers.
public class Test8 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Student> student=populateList();
			System.out.println("Enter subject");
			String str=sc.next();
			student.stream().filter(p->p.getSubject()==Subject.valueOf(str.toUpperCase())).mapToDouble(p->p.getGpa())
			.sorted(). limit(3).forEach(System.out::println );
			

	}

}
}