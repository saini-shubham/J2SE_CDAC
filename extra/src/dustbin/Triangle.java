package dustbin;

public class Triangle {
	public void triangle(int rows) {
		int space= rows-1;
		for(int i =1;i<=rows;i++) {
			for (int j=1;j<=space ;j++)
				System.out.print(" ");
			space--;
			for (int j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println("");
		}
	}
	
	public void reverseTriagle(int rows) {
		for (int i=0;i<=rows;i++) {
			for (int j=0;j<=i;j++)
				System.out.print(" ");
			for(int j=0;j<=rows-1-i;j++)
				System.out.print("* ");
			System.out.println(" ");
		}
	}
	
	public static void main(String [] args) {
		Triangle name = new Triangle();
		name.triangle(20);
		name.reverseTriagle(4);
	}

}
