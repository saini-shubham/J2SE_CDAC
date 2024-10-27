package p2;

public class MyFormula implements Formula,Formula2 {

	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method from the i/f");
		System.out.println(Formula.super.sqrt(15 , 10));
		return a*a;
	}
	//What will happen in case of duplicate default method implementation ? : javac err
	//soln : Javac forces implementation class to override the duplicate default method definition.
	@Override
	public double sqrt(double a,double b) {
		//Can u access i/f 's def func ?
		System.out.println(Formula.super.sqrt(15 , 10));
		System.out.println(Formula2.super.sqrt(15, 10));
		//MUST override method
        return Math.sqrt(a*b);
    }
	

}
