package tester;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static com.core.task.Task.sdf;

import com.core.task.Status;
import com.core.task.Task;

import cust_excp.CustomTaskException;

import static utils.TaskManagerUtils.populateMap;
public class TaskManager {

	public static void main(String[] args) throws ParseException {
		try(Scanner sc =new Scanner(System.in)){
			//Map<Integer, Task> map=new HashMap<>();
			Map<Integer, Task> map= populateMap();
			System.out.println("1) Add new task"
					+ "2) Delete a task"
					+ "3) Update task status"
					+ "4) Display all pending task"
					+ "5) Display all pending task for today"
					+ "6)Display all task sorted by task date"
					+ "7) Exit");
			System.out.println("Choose an option");
			try{ 
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter :  task Name, task Description,task Date");
					Task task=new Task(sc.next(),sc.next(),sdf.parse(sc.next()));
					map.put(task.getTaskId(),task);
					System.out.println("Successfully added");
					break;
				case 2:
					System.out.println("Enter the taskID");
					if(map.remove(sc.nextInt())!=null)
							System.out.println("Succesfuuly deletd");
					else
						throw new CustomTaskException("Task ID dosn't exist");
					 
		
					break;
				case 3:
					System.out.println("Enter the taskId");
					
						
					
					
					
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			}
			
			
		}
	}

