package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import com.app.core.Student;


public class IOUtils {
	//add a static method to write list of sorted student to the text file(in buffered manner)
	public static void storeStudentDetails(String fileName,List<Student> students) throws IOException {
		//attach i/o streams: java app --> PW --> FW --> text file
		
		try(PrintWriter pw = new PrintWriter(new FileWriter(fileName))){
			//students.forEach(s -> pw.println(s));
			students.forEach(pw::println);
		}
	}
}
