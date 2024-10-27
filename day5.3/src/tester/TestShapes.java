package tester;


/* using the concept of abstact method and abstract class*/
import shapes.BoundedShapes;
import shapes.Circle;
import shapes.Rectangle;

public class TestShapes {

	public static void main(String[] args) {
		BoundedShapes[] shapes= {new Circle(2,2,4.5),new Rectangle(5,5,3,7)};
		for(BoundedShapes shape:shapes) // shapes[0]=Circle, shapes[1]=Rectangle
		{
			System.out.println(shape);
			System.out.println("Area:"+shape.area()); /*We have declared area() in Super class so javac will be satisfied
			 											and at runtime JVM will invoke the area() by type of object BpundedShapes is referring to*/
		}
	}

}
