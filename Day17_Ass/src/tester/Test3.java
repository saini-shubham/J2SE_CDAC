package tester;
//4 Print name of specified subject  topper
import static utils.StudentCollectionUtils.populateList;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

//4 Print name of specified subject  topper
public class Test3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Student> student=populateList();
			System.out.println("Enter subject");
			String str=sc.next();
			//OptionalDouble max=student.stream().filter(p->p.getName()==str.toUpperCase()).mapToDouble(p->p.getGpa()).max();
			student.stream().filter(p->p.getSubject()==Subject.valueOf(str)).

		}

	}
}
