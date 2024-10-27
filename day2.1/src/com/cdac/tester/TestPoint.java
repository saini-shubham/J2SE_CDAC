package com.cdac.tester;
import com.cdac.geometry.Point2D;
import java.util.Scanner;
import static java.lang.System.*;

class TestPoint{
public static void main(String[] args){
	Scanner sc = new Scanner(in);
	System.out.println("Enter x , y co ords for  1st point");
	Point2D p1=new Point2D(sc.nextInt(), sc.nextInt());
	System.out.println("Enter x , y co ords for 2nd point");
	
	Point2D p2=new Point2D(sc.nextInt(), sc.nextInt());
	
	

	boolean flag =p1.isEqual(p2);
	if(flag)
		System.out.println("Points are at the same location");
	else {
		System.out.println("Points are at the different location");
		//calc distance
		double distance=p1.calculateDistance(p2);
		System.out.println("Distance between them"+distance);
	}
	
    sc.close();
    
}
}