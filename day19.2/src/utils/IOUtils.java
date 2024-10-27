package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOUtils {
	// add a static method for de-seialization
	public static Object restoreProducts(String fileName) throws IOException, ClassNotFoundException {
		// file validation
		File f1 = new File(fileName);
		if (f1.isFile() && f1.canRead()) {
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f1))) {
				return in.readObject(); // de-serialztion is going to happen here
			}

		}
		System.out.println("Invalid file name or file doesn;t exists");
		return null;
	}

}
