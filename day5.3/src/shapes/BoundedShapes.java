package shapes  ;  

public abstract class BoundedShapes extends Object{   //extends Object is implicitly added
	private int x,y;
	public BoundedShapes(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Co-ordinates are: "+this.x+","+this.y;
	}
	
	public abstract  double area();
//	{
//		return -100;
//	}

}
