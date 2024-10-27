package tester;

import java.util.HashSet;

import com.app.core.Book;
import com.app.core.Category;
import static java.time.LocalDate.parse;
public class Tester1 {
	public static void main(String[] args) {
		HashSet<Book> book = new HashSet<>();
		Book b1=new Book("Wimpy",Category.HISTORY , 1200, parse("2000-02-02"), "Tripy", 10);
		Book b2=new Book("RiseOfApes",Category.MYTH , 1500, parse("2001-02-02"), "ROck", 20);
		System.out.println("b1 addded"+ book.add(b1));
		System.out.println("b2 addded"+ book.add(b2));
		
		
	}

}
