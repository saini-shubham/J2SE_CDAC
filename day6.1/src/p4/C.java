package p4;

public class C implements A,B{

	@Override
	public double compute(double d1, double d2) {
		// TODO Auto-generated method stub
		return d1+d2;
	}  //error after writing this line->either declare class as abstract or define abstarcted methods

	@Override
	public int compute(double d1,double d2) {
		// TODO Auto-generated method stub
		return d1;
	}

	//same function,same signature, different return type  --> javac error --> yoy cant ever resolve this javac error

	
}
