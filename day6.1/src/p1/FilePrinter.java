 package p1;

public class FilePrinter implements Printer {
	
	@Override
	public void print(String msg) {
		System.out.println("Storing a msg in the file"+msg);
		
	}
	

}
