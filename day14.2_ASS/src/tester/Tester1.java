package tester;

import static java.time.LocalDate.parse;
import static utils.LibraryUtils.populateList;
import static com.app.core.Category.valueOf;
import java.util.HashMap;
import java.util.Scanner;
import custom_package.*;
import com.app.core.Book;
public class Tester1 {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		HashMap<String, Book> bookMap=populateList();
		boolean flag=false;
		while(!flag) {
			System.out.println("1)Add Book"
					+ "2)Display all books in the library"
					+ "3)Issue a a single copy of book"
					+ "4)Return a book"
					+ "5)Remove Book"
					+ "10) Exit");
			try {
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter title of the book");
				String str=sc.next();
				
				if(bookMap.containsKey(str) ) {
					System.out.println("Book already exist and");
					Book b=bookMap.get(str);
					System.out.println("Enter the quantity");
					b.setQuantity(sc.nextInt());
				}
				else {
					bookMap.put(str, new Book(str, valueOf(sc.next().toUpperCase()), sc.nextDouble(), parse(sc.next()), str, sc.nextInt()));
				}
					
					
				
				break;
			case 2:
				System.out.println("All books details");
				for(Book b: bookMap.values()) {
					System.out.println(b);
				}
				break;
			case 3:
				System.out.println("Enter the title of copy");
				Book b=bookMap.get(sc.next());
				if(b==null)
					throw new bookCustomException("Enter valid title");
				else {
					System.out.println("Book issued");
					b.setQuantity(b.getQuantity()-1);	
				}
				break;
				
			case 4:
				System.out.println("Enter the title of copy");
				
				b=bookMap.remove(sc.next());
				if(b==null) 
					System.out.println("Can't find book");
				else
					System.out.println("book removed"+b.getTitle());
					
					
			case 10:
				flag=true;
				break;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		}
		}
	}

}

