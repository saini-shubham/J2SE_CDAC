package p1;

public class Test2 {
	public static void main(String[] args) {
		Printer p;   //p is an interface type of reference , no object created so far, bytes allocates as per JVM specification, on stack
		//System.out.println(p);
		p=new FilePrinter(); //Is FilePrinter A Printer?? -> yes -> Upcasting
							// i/f refer directly to any implementation class instance
		p.print("Some Messgae");//no javac error since print() exists in Printer, 
		
		p=new NetworkPrinter(); 
		p.print("");
	}

}
