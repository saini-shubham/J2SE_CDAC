package tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFileCopy2 {

	public static void main(String[] args) {
		System.out.println("Enter the source file and detination file names on two separate line");
		try(Scanner sc=new Scanner(System.in); 
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine(),true)))   //setting append flag to true
		{
			br.lines()
			.forEach(line -> pw.println(line));
			System.out.println("File coppied successfully!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
