package p1;

public class Test3 {
	public static void main(String[] args) {
		Printer[] printers= {new FilePrinter(), new ConsolePrinter(),new NetworkPrinter()}; /* Printer.class,[Lp1.printer.class,FilePrinter.class
		,NetworkPruinter.class,ConsolePrinter.class loaded in metaspace*/
		
		for(Printer p:printers) {
			p.print("test message");
			
			//can non implementation class access i/f constants directly? -->NO
		System.out.println(Printer.DATA);
		}
		
	}

}
