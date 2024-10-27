package p5;

public interface C extends A,B  //no javac error here because interface is pure abstract
{  
	double add(double a, double b);
	double divide(double a,double b);
}
