package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Product;
import static utils.CollectionUtils.*;
public interface IOUtils {
	//add a static method , to store map of products in a file using  Serialization (java.io.ObjectOutputStream) = Conversion from state of the object to bun.
	static void storeProductDetails(Map<Integer, Product> map, String fileName) throws IOException {
		// Java App ---> OOS --->bin strm (serialized bin strm) --> FOS ---> Bin File
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			// API public void writeObject(Object o) throws ...
			out.writeObject(map);
		} // out.close
	}

	// add a static method for de-seialization
	//for 1st time : no bin file -> rets populated map  with sample data, 
	//o.w returns restored map from bin file
	@SuppressWarnings("unchecked")
	public static Map<Integer,Product> restoreProducts(String fileName) throws IOException, ClassNotFoundException {
		// file validation
		File f1 = new File(fileName);
		if (f1.isFile() && f1.canRead()) {
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f1))) {
				return (Map<Integer,Product>)in.readObject(); // de-serialztion is going to happen here
			}

		}
		System.out.println("Invalid file name or file doesn't exists");
		return populateMapFromList(populateData()) ;
	}
}
