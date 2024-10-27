/*2. Refer to Collection i/f 's higher order function :  removeIf
Use it to remove all books published before a specific date. */

package tester;
import static utils.LibraryUtils.populateMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Book;

public class Test2 {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)){
			HashMap<String,Book> map=populateMap();
			System.out.println("");
			map.forEach((p1,p2) -> System.out.println("k:"+p1+"v:"+p2) );
			//System.out.println("Enter the date before which you want to remove the books" );
			//LocalDate date=parse(sc.next());
			LocalDate date= LocalDate.parse("2016-01-01");
			map.values().removeIf((p1)-> p1.getPublishDate().isBefore(date));
			System.out.println("After removal");
			map.forEach((p1,p2)-> System.out.println("k:"+p1+"v"+p2));
//			map.values().forEach((b1) -> { b1.getPublishDate());
//			boolean remove = map.removeIf((p1,p2) -> p2 );
			
			
			
		} 
	}

}
