package bin_io;
import static utils.IOUtils.storeProductDetails;

import java.util.Scanner;

import static utils.CollectionUtils.*;

public class StoreProductDetails {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter bin file name");
			//get populated map, store it in binary file
			storeProductDetails(populateMapFromList(populateData()), sc.nextLine()); 
			System.out.println("Data Stored");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Main Over");
	}

}

//See the output --> is it ordered or unordered?? --> unordered --> solution is LinkedHashMap
