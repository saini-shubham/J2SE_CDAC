package utils;

import static com.app.banking.AcType.*;

import java.util.HashMap;
import static java.time.LocalDate.parse;
import com.app.banking.BankAccount;
public class BankUtils {
	//add a static method to return populated map of a/cs
	public static HashMap<Integer, BankAccount> populateAccountMap(){
		//create an empty Map and populate it
		HashMap<Integer, BankAccount> map=new HashMap<>();		//hash list is created in heap
		System.out.println("addeed"+map.put(101, new BankAccount(101, "Rama", SAVING, parse("2020-05-23"), 15000)));
		System.out.println("addeed"+map.put(100, new BankAccount(10, "Ketan", FD , parse("2020-05-23"), 15000)));
		System.out.println("addeed"+map.put(1000, new BankAccount(1000, "Riya", DMAT, parse("2020-05-23"), 15000)));
		System.out.println("addeed"+map.put(56, new BankAccount(56, "ram", SAVING, parse("2020-05-23"), 15000)));
		System.out.println("addeed"+map.put(129, new BankAccount(129, "Raj", SAVING, parse("2020-05-23"), 15000)));
//		System.out.println("addeed"+map.put(101, new BankAccount(101, "Kiran", SAVING, parse("2020-05-23"), 15000)));
		System.out.println("addeed"+map.putIfAbsent (101, new BankAccount(101, "Kiran", SAVING, parse("2020-05-23"), 15000)));

		System.out.println("size of map:"+map.size());
		return map;
	}

}
