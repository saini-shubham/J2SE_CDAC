package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import com.app.core.Product;

public interface IOUtils {
	//add a static method to store sprtedd product details in a text file using buffering
	static void storeProductDetails(List<Product> productList, String fileName) throws IOException {
		
		//attach IO streams
		//JavaApp -> PrintWriter -> FileWriter -> TextFile
		try(PrintWriter pw= new PrintWriter(new FileWriter(fileName))){
			
			productList.forEach(p->pw.println(p));  //pw::println
			
		}
		
	}

}
