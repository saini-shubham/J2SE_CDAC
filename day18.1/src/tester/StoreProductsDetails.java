package tester;

import static utils.CollectionUtils.populateData;
import static utils.CollectionUtils.populateMapFromList;
import static utils.CollectionUtils.sortProductsDescPrice;
import static utils.IOUtils.storeProductDetails;

import java.util.List;
import java.util.Scanner;

import com.app.core.Product;

public class StoreProductsDetails {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter the file name");
			//get popuplated sample data(map) -> sort it and store it
			storeProductDetails(sortProductsDescPrice(populateMapFromList(populateData())), sc.nextLine()); 
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
