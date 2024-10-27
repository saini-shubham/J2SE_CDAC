package runnable_task;

import java.util.Map;

import com.app.core.Student;

import static utils.StudentCollectionUtils.sortStudentsByGpa;
import static utils.IOUtils.storeStudentDetails;

public class GpaSorterTask implements Runnable {
	//state
		private Map<String,Student> studentMap;
		private String fileName;
		
		public GpaSorterTask(Map<String, Student> studentMap, String fileName) {  //invoked by main thread
			super();
			this.studentMap = studentMap;
			this.fileName = fileName;
			System.out.println("in ctor of "+getClass() +"invoked by "+ Thread.currentThread());
		}
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread() +" started");
			try {
				storeStudentDetails(fileName,sortStudentsByGpa(studentMap));
			}catch(Exception e ) {
				System.out.println(Thread.currentThread() + " got errr"+e);
			}
			System.out.println(Thread.currentThread() +" over");
			
		}

}
