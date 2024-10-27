package utils;

import java.util.HashMap;
import com.app.core.Book;
import com.app.core.Category;
import static java.time.LocalDate.parse;
public class LibraryUtils {
	public static HashMap<String,Book> populateMap() {
	HashMap<String,Book> map=new HashMap<>();
	System.out.println("added"+ map.put("Meluha", new Book("Meluha", Category.HISTORY, 500, parse("2015-12-12"), "Amish", 1000)));
	System.out.println("added"+ map.put("Nagas", new Book("Nagas", Category.HISTORY, 500, parse("2019-12-12"), "Amish", 1100)));
	System.out.println("added"+ map.put("Tripy", new Book("Tripy", Category.ROMANCE, 500, parse("2015-12-12"), "Hipy", 500)));
	System.out.println("added"+ map.put("Emech", new Book("Emech", Category.NOVEL, 500, parse("2015-01-09"), "PSBhimra", 1600)));
	System.out.println("added"+ map.put("Rangoli", new Book("Rangoli", Category.POEMS, 500, parse("2020-12-10"), "Rama", 200)));
	System.out.println("Size of map:"+ map.size());
	return map;
	}
	//public static List<> list(Map<> )
	

}
