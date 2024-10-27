package inheritance;

public class Student extends Person {
	private int gradYear;
	private String course;
	private double fees;
	private int marks;
	public Student(String fn, String ln, int gradYear,String course,double courseFees,int marks) {
		super(fn,ln);     // if you don't do this then complier will explicitly add super() 
						  //and calls immediate super class default ctor
		System.out.println("in Student");
		this.gradYear=gradYear;
		this.course=course;
		fees=courseFees;
		this.marks=marks;
	}
	
	
	// Are you happy inhereting Person's toString or do you want to modify it further ?
	// Obviously we want to modify it
	@Override
	public String toString() {
		return "Student"+super.toString()+" graduated in "+gradYear+" course "+course+" fees "+fees+" "+" marks"+marks;
			
		//super
	
	}
	//NOTE: adding super keyword is mandatory only only if we have the same function in the sub class and super class and we want to invoke the method of super class
	
	//add Student specific functionality: study
	//It should display first name studing in course courseName
	public void study() {
		System.out.println(getFirstName()+" course is "+course);
		//System.out.println(toString()+" course is"+course);

	}

}
