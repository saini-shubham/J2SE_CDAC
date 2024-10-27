package tester;
import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;

import runnable_task.DobSorterTask;
import runnable_task.GpaSorterTask;
public class TestCollectionIOThreads {

	
	//refer diagram in day 20
	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in);){
			//get populated map from collection utils
			Map<String,Student> map = populateMap(populateList());
			System.out.println("Enter the file name to store the student details sorted as per DOB");
			String file1=sc.nextLine();
			System.out.println("Enter the file name to store the student details sorted as per GPA");
			String file2=sc.nextLine();
			//create task instance - attach a thread to the task and start it
			//Thread(runnable task, String name)
			Thread t1 = new Thread(new DobSorterTask(map,file1),"dob_soretr");
			Thread t2 = new Thread(new GpaSorterTask(map,file2),"gpa_soretr");
			//t1,t2 :New, main : Runnable
			t1.start();
			t2.start();
			System.out.println("main waiting for child threds to complete the execution");
			t1.join();		//main is blocked on join for t1's completion
			t2.join();		//main is blocked on join for t2's completion
			System.out.println("Child threads over");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over");

	}

}
