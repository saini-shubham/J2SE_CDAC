package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Map;

import com.app.core.Category;
import com.app.core.Product;

public interface IOUtils {
//add a static method to store map of products in a bin file , in a buffered manner
	static void storeProductDetails(Map<Integer, Product> map, String fileName) throws IOException {
		// Java App ---> DOS(conversion strm) --> bin data --> BOS --> buffer ---> FOS
		// ---> Bin File
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName))))

		{
			map.forEach((k, v) -> {
				// write product id in pure bin format
				try {
					out.writeInt(v.getId());
					// name
					out.writeUTF(v.getName());
					// category
					out.writeUTF(v.getProductCatgeory().toString());
					// date
					out.writeUTF(v.getManufactureDate().toString());
					// price
					out.writeDouble(v.getPrice());
				} catch (IOException e) {
					System.out.println("err in lambda " + e);
				}
			});
		}
	}

	// add a static method to restore product details in LinkedHashSet from a
	// bindary file

	static LinkedHashSet<Product> restoreProducts(String fileName) throws IOException {
		/*
		 * validate file name => Create File class instance
		 */
		File f1 = new File(fileName); // wrapping abstract path into File class instance
		if (f1.isFile() && f1.canRead()) {// => regular, readable data file -> can attach data stream
											// Java App <-- DIS <-- BIS <-- FIS <-- Binary file
			LinkedHashSet<Product> productSet = new LinkedHashSet<>();
			try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(f1)))) {
				// read product details using DIS(readInt,readUTF...) --> create product
				// instance
				// add reference in the LinkedHashSet
				while (true) {
					productSet.add(new Product(in.readInt(), in.readUTF(), Category.valueOf(in.readUTF()),
							LocalDate.parse(in.readUTF()), in.readDouble()));

				}

			} catch (EOFException e) {
				System.out.println("end of file ...data reading over");
				return productSet; // upon EOF, returns populated LHS<product> to caller
			}
		}

		return null; // in case of any errors this method is smiply returning null to the caller. We
						// will imporve it later.
	}

}
