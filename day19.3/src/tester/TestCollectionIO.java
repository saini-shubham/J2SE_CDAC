package tester;

import static utils.IOUtils.restoreProducts;
import static utils.IOUtils.storeProductDetails;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Product;

import custom_exception.ProductHandlingException;
public class TestCollectionIO {
	
public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);)
		{
			//init phase of the app: restore the map(i.e de-serialization)
			System.out.println("Enter file name for restoring products details");
			String fileName=sc.nextLine();
			restoreProducts(fileName);
			Map<Integer, Product> map = restoreProducts(fileName); 
			System.out.println("Prdocts"+map);
			boolean exit=false;
			while(!exit) {
				System.out.println("Options: 1) Update product price 2) remove a Product 3) Exit");
				System.out.println("Choose option");
				try {
					switch(sc.nextInt()){
					case 1:
						System.out.println("Enter product id and price offset");
						Product p=map.get(sc.nextInt());
						if(p==null)
							throw new ProductHandlingException("Invalid Product ID");
						p.setPrice(p.getPrice()+sc.nextDouble());
						System.out.println("Price updated for product "+p.getId());
						break;
					case 2: 
						System.out.println("Enter producst id");
						p=map.remove(sc.nextInt());
						if(p==null)
							throw new ProductHandlingException("Invalid Product ID ");
						System.out.println("removed product "+p);
						break;
					case 3: 
						exit=true;
						//store products before exiting
						storeProductDetails(map, fileName);
						System.out.println(" products details stored ");
						break;
				}}
				catch(Exception e){
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
