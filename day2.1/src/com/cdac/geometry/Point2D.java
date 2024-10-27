package com.cdac.geometry;
public class Point2D{
	private int x,y;
	public Point2D(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String show(){
		return "Point coordinates are: "+x+","+y; 
	}
	
	//p1.isEqual(p2)  this=p1 , anotherPoint=p2
	public boolean isEqual(Point2D anotherPoint){
		return this.x==anotherPoint.x && this.y==anotherPoint.y;
		
	}
	public double calculateDistance(Point2D anotherPoint ){
		return Math.sqrt(Math.pow((this.x-anotherPoint.x),2)+Math.pow((this.y-anotherPoint.y),2));
	}
}