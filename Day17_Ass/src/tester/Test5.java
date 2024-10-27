package tester;

import static utils.StudentCollectionUtils.populateList;

import java.util.List;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

//5 Print no of  failures for the specified subject chosen  from user.
//(gpa < 5 : failed case)
public class Test5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Student> student=populateList();
			System.out.println("Enter subject");
			String str=sc.next();
			long count=student.stream().filter(p->p.getSubject()==Subject.valueOf(str.toUpperCase()) && p.getGpa()<5).count();
			if(count != 0)
				System.out.println("total fail students:"+count);
			else
				System.out.println("Noone is fail");
			}

}
	}
