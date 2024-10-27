package utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.app.core.Task;

import CustomException.CustomTaskException;

public class TaskUtils {
	
	public static Task findTask(int id,HashMap<Integer,Task> task) throws CustomTaskException {
		Task t=task.get(id);
		if(t==null)
			throw new CustomTaskException("Invalid taskID");
		return t;
	}
	
	public static HashMap<Integer, Task> populateTask() {
		HashMap<Integer, Task> task = new HashMap<>();

		Task t1 = new Task("Studying", "Java and DBT", LocalDate.parse("2022-12-10"));
		task.put(t1.getTaskId(), t1);

		Task t2 = new Task("Playing", "FootBall's final", LocalDate.parse("2022-05-25"));
		task.put(t2.getTaskId(), t2);

		Task t3 = new Task("Excercise", "Cardio", LocalDate.parse("2022-16-05"));
		task.put(t3.getTaskId(), t3);
		return task;

	}
}
