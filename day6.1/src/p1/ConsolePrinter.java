package p1;

public class ConsolePrinter implements Printer {
	@Override
	public void print(String msg) {
		System.out.println("Printing a msg on the console"+msg);
		
		//can implementation class access the i/f constant directly ? --> Yes
		System.out.println(DATA);
	}

}
