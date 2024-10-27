/*
 * Create a driver  class(for UI)  , in the "tester" package "TestPoints" , with main(..)

Ask user , how many points to plot? :
Create suitable array.
4.2  Accept x,y co-ordinates for all the points n store it suitably.
4.3   Display x,y co-ordinates of all the points plotted so far ,using for-each loop.
4.4   Accept 2 indices from user .
Find out if the points at these indices are same or different (Hint : isEqual)
Print the message accordingly. 
If points are not same , display distance between these 2 points.

*/

package com.cdac.tester;
import static java.lang.System.in;
import com.cdac.geometry.Point2D;
//import com.cdac.geometry.*;
import java.util.Scanner;
public class TestPoints {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		System.out.println("How many points to plot?");
		Point2D[] point = new Point2D[sc.nextInt()];
		for(int i=0;i<point.length;i++) {
			System.out.println("Enter points");
			point[i]= new Point2D(sc.nextInt(),sc.nextInt());	
		}
		
		for(Point2D element :point) {
			System.out.println(element.show());
		}
		Point2D[] index;
		System.out.println("Enter two indices");
		int Index1=sc.nextInt();
		int Index2=sc.nextInt();
		if(Index1>=0 && Index1 < point.length && Index2>=0 && Index2 < point.length && endIndex>=0 && endIndex < point.length)
		{	
//			if(point[Index1].isEqual(point[Index2]){
//			System.out.println("Points are same");
//		}
			
// for clean code:
			Point2D point1=point[Index1];
			Point2D point2=point[Index2];
			if(point1.isEqual(point2))
				System.out.println("Points are equal");
			else
				System.out.println("POints are different");
			
			
		}
		
		
		sc.close();
	}

}
