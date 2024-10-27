//. Write a tester to display books from the list.

package tester;
import static utils.LibraryUtils.populateMap;

import java.util.Collections;
import java.util.Map;

import com.app.core.Book;

public class Test1 {

	public static void main(String[] args) {
			
			Map<String,Book> map=populateMap();
			System.out.println("Before Sorting");
			map.forEach((p1,p2)->System.out.println("k:"+p1+"v"+p2));
			System.out.println("After Sorting");
			Collections.sort(map,(p1,p2) ->  );

	}

}
