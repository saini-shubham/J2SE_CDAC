package tester;
import static utils.BankUtils.populateAccountMap;

import java.util.HashMap;
import java.util.Scanner;
import static java.time.LocalDate.parse;
import com.app.banking.BankAccount;
import static com.app.banking.AcType.valueOf;
import custom_exception.BankingException;
public class TestBanking {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		HashMap<Integer, BankAccount> accountMap=populateAccountMap();
//		for(HashMap hs: accountMap) {  // see the error
//			
//		}
		boolean exit=false;
		while(!exit) {
			System.out.println("1) Create A/c"
					+ "2) Display all a/c information"
					+ "10) EXit");
			System.out.println("Choose an option");
			try {
				switch(sc.nextInt()) {
				case 1: 
					System.out.println("Enter a/c");
					int accNo=sc.nextInt();
					if(accountMap.containsKey(accNo))
						throw new BankingException("Duplicate account number");
					System.out.println("Enter a/c details: CustomerName, accType, CreationDate(yyyy-MM-dd)");
					accountMap.put(accNo, new BankAccount(accNo, sc.next(), valueOf(sc.next().toUpperCase()), parse(sc.next()), sc.nextDouble()));	
					System.out.println("Account added successfully!!");
					
					break;
				case 2:
					System.out.println("All bank details");
					for(BankAccount a: accountMap.values())   /*conversion of HashMap to Collection using values()
					 										  *So that we will be able to iterate */
					 										  
						System.out.println(a);
					break;
					
				case 3: System.out.println("Enter a/c no");
						BankAccount acct=accountMap.get(sc.nextInt());
						if(acct==null)
							throw new BankingException("Invalid a/c no");
						System.out.println("Acccount summary"+acct);
				break;
				
				case 4:
					System.out.println("Enter source and destination a/c no and transfer amount");
					acct=accountMap.get(sc.nextInt());
					if(acct==null)
						throw new BankingException("Invalid source a/c no");
					//if ctrl reaches here -> sourse a/c is valid -> now validate destination a/c no
					BankAccount dest=accountMap.get(sc.nextInt());
					if(dest==null)
						throw new BankingException("Invalid destination a/c no");
					acct.fundsTransfer(dest, sc.nextDouble());
					break;
					
				case 5:
					System.out.println("Enter a/c no to close");
					acct=accountMap.remove(sc.nextInt());
					if(acct==null)
						throw new BankingException("Invalid  a/c no!! Can't close the account");
					System.out.println("Closed account"+acct);
					break;
					
					
					
				case 10: exit =true;
				break;
				
				
				
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
			sc.nextLine();
		}
		System.out.println("HM"+accountMap);

	
	}
	}

}
