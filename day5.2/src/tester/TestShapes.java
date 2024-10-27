package tester;

import shapes.BoundedShapes;
import shapes.Circle;
import shapes.Rectangle;

public class TestShapes {
	public static void main(String[] args) {
	BoundedShapes[] shapes= {new Circle(10,20,10.5), new Rectangle(30,60,10,5.5)};  //upcasting
	
	//display details about their shapes
	for(BoundedShapes shape1: shapes) {
		System.out.println(shape1);
		//System.out.println(shape1.area());  <-- uncomment it and read the error
		//System.out.println(((Circle)shape1).area());  //throws run time error for Rectangle  --> insatanceof
		if(shape1 instanceof Circle)
			System.out.println("Area:"+((Circle)shape1).area());
		else
			System.out.println("Area:"+((Rectangle)shape1).area());
			
	}
	
	}
}
