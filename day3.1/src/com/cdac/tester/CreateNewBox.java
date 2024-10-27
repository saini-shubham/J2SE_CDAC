/*
 * earlier passed dimensions: 10 20 30
 * Dimension offset: 2 -3 5
 * Updated Dimension: 12 17 35
 * 
 * */

package com.cdac.tester;
import com.cdac.core.Box;
import java.util.Scanner;

public class CreateNewBox {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter box dims : w d h");
		 Box b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		 System.out.println(b1.getBoxDims());  //reference passing
		 
		 System.out.println("Enter dimension offset to create another box w.r.t to earlier box :"
		 		+ "widthoffset heightoffset heightoffset");
		 Box newBox=b1.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		 System.out.println(newBox.getBoxDims());
		 System.out.println("new box hashcode"+newBox.hashCode());
		 sc.close();			

	}

}
