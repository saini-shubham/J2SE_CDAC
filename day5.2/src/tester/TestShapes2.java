package tester;
import shapes.Rectangle;
import shapes.Circle;
import shapes.BoundedShapes;

public class TestShapes2 {
	public static void main(String[] args) {
	BoundedShapes[] shapes= {new Circle(10,10,10.2),new Rectangle(20,20,18,19.2)};
	
	for(BoundedShapes shape1:shapes) {
		System.out.println(shape1);
		if(shape1 instanceof  Circle) 
			System.out.println(shape1.area()); //we added area() in the superclass
											   /* javac will be statisfied by finding area() in BondedShapes
											    * and JVM will invoke area() declared in Circle class
											    * Reason: javac resolves the method bonding bu the type of reference
											    * and JVM resolves method bonding by the type of object it is reffering to */
		else
			System.out.println(shape1.area()); 
	}
	
	}
}
