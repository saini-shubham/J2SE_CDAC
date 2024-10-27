package shapes;

public class Rectangle extends BoundedShapes {
	private double length,breadth;

	public Rectangle(int x, int y, double length, double breadth) {
		super(x, y);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle "+super.toString()+  "[length= " + length + ", breadth=" + breadth + "]";
	}
	public double area() {
		return this.length*this.breadth;
	}
	

	
}
