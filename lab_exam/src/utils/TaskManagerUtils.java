package utils;

import java.text.ParseException;
import java.util.HashMap;
import com.core.task.Status;
import com.core.task.Task;

import static com.core.task.Task.sdf;

public class TaskManagerUtils {
	public static HashMap<Integer,Task> populateMap() throws ParseException{
		HashMap<Integer, Task> map = new HashMap<Integer, Task>();
//		map.put(1, new Task("Walking", "For healthy mind and body", 12-12-2022, Task. , false))
		System.out.println(" added "+ map.put(1, new Task("Grocery Shopping", "Bread, Chips, Maggi", sdf.parse("20-05-2023"),Status.PENDING  , true)));
		System.out.println(" added "+ map.put(2, new Task("Car Washing", "Inside and Outside car cleaning", sdf.parse("12-05-2023"),Status.COMPLETED  , false)));
		System.out.println(" added "+ map.put(3, new Task("Studying", "OSC and DBT", sdf.parse("27-05-2023"),Status.PENDING  , true)));
		System.out.println(" added "+ map.put(4, new Task("Watching", "Watch IPL Final", sdf.parse("20-06-2023"),Status.PENDING  , true)));
		System.out.println(" added "+ map.put(5, new Task("Playing", "Tournament Final", sdf.parse("15-05-2023"),Status.INPROGRESS  , false)));
		return map;
	}

}
