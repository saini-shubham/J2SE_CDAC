package tester;
import static utils.IOUtils.restoreProducts;

import java.io.IOException;
import java.util.Scanner;
public class TestDesrialization {

	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)) {
			// TODO Auto-generated method stub
			System.out.println("Enter file name");
			System.out.println(restoreProducts(sc.nextLine() ));
			//Observe: manufactureDate is intialized to null. Reason: we made it as a transient during serializtion
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Main over");

	}

}
