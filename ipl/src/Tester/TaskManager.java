package Tester;

import static utils.TaskUtils.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import static java.time.LocalDate.parse;
import com.app.core.Status;
import com.app.core.Task;

public class TaskManager {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<Integer, Task> tasks = populateTask();
			boolean exit = false;
			while (!exit) {
				System.out.println("1) Add new task"
					+ "2) Delete a task"
					+ "3) Update task status"
					+ "4) Display all pending task"
					+ "5) Display all pending task for today"
					+ "6) Display all task sorted by task date"
					+ "7) Exit");
				System.out.println("Enter Choice :");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter taskName, description, date");
						Task tasker = new Task(sc.next(), sc.next(), parse(sc.next()));
						tasks.put(tasker.getTaskId(), tasker);
						System.out.println("Added Successfully!!");
						break;

					case 2:
						System.out.println("Enter task ID");
						tasker = findTask(sc.nextInt(), tasks);
						tasker.setActive(false);
						System.out.println("Task deleted!!");
						break;
						
					case 3:
						System.out.println("Enter task ID");
						tasker = findTask(sc.nextInt(), tasks);
						System.out.println("Enter the updated status :");
						tasker.setStatus(Status.valueOf(sc.next().toUpperCase()));
						System.out.println("Status Updated!!");
						break;
						
					case 4:
						System.out.println("Pending tasks: ");
						tasks.values().stream().filter(p -> p.getStatus().equals(Status.PENDING))
								.forEach(System.out::println);
						break;
						
					case 5:
						System.out.println("Pending tasks for today:");
						tasks.values().stream().filter(p -> p.getDate().equals(LocalDate.now()))
								.forEach(System.out::println);
						break;
						
					case 6:
						tasks.values().stream().sorted((p1, p2) -> p1.getDate().compareTo(p2.getDate()))
								.forEach(System.out::println);
						break;
					case 7:
						exit = true;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				sc.nextLine();
			}

		}
	}
}