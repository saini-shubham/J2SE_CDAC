package test_static;

import static java.lang.System.out;
import static java.lang.System.in;
import static java.lang.Math.sqrt;

import java.util.Scanner;
public class Test1 {
	private int i;
	private static int j;
	public static void main(String[] args)  // Test1 class will be loaded at this point
	{ 
		Scanner sc = new Scanner(in);
		show();
		Test1 ref = new Test1();
		out.println("Square root of 25:"+sqrt(25));
		sc.close();
	}
	static void show() {
		// what all can you access?? ->> only j
		out.println(j);
	}
	void showAgain(){
		// what all you can access?? ->> both i and ja
		out.println(i);
	}
}
