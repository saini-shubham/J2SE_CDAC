package p1;

public class Test4 {
	public static void main(String[] args) {
		Printer[] printers= {new FilePrinter(), new ConsolePrinter(),new NetworkPrinter()}; /* Printer.class,[Lp1.printer.class,FilePrinter.class
		,NetworkPruinter.class,ConsolePrinter.class loaded in metaspace*/
		
		for(Printer p:printers) {
			p.print("test message");
			//p.close();   //javac search for close() in the Printer i/f --> not found --> javac error
			//((FilePrinter)p).close();  //classcastexception for p[1],p[2]
			if(p instanceof FilePrinter)
			((FilePrinter)p).close();
			else
				System.out.println("Not a file printer");
		
		}
		
	}

}
