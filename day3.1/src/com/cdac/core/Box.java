package com.cdac.core;
public class Box
{
 //tight encapsulation 
 private double width,depth,height;
 //add a parameterized ctor to init complete state of the Box
 public Box(double width,double d,double height)
 {
	  this.width=width;//this : mandatory
	  this.depth=d;//this  : optional
	  this.height=height;//this : mandatory	  
 }
 //Add a non static method  to return Box details in String form (dimensions of Box)
 
 public Box(double side){
//	 width=depth=height=side; // but it is violating DRY
	 this(side,side,side);    //constructor chaining; calling constr with three arguments.
 }
 
 
 //add another overloaded ctor to create a default intialized ctor
 public Box(){
	 this(-1);  			//constructor chaining
 } 
 public String getBoxDims()
 {
	  return "Box dims w="+this.width+" d="+this.depth+" h="+this.height;	  
 }
 //add non static method to ret computed volume of the box
 public double getVolume()
 { 
  return width*depth*height;//javac impl adds : this 
 } 

// add non static method to test equality of two boxes
// in java everything is paased by value: this =b1, anotherBox=b2
 
 public boolean isEqual(Box anotherBox){
	 System.out.println(this.hashCode()+" "+anotherBox.hashCode());
	 return this.width==anotherBox.width && 
			 		this.depth==anotherBox.depth 
			 		&& this.height==anotherBox.height;
 }
 
 
 // add a non static method to create a new box with supplied offset
 // static because it is in refernce with another box
 
 public Box createNewBox(double wOff,double dOff,double hOff) {
	 Box tmp = new Box(this.width+wOff,this.depth+dOff,this.height+hOff);
	 System.out.println("tmp's hash code"+tmp.hashCode());
	 return tmp; 		// returning references
	 
 }
 
 //getter 
 public double getWidth() {
	 return this.width;
 }
 
 //setter
 public void setWidth() {
	 this.width=width;
 }
}