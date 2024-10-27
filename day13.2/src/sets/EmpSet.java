//first go through TestHashSet.java
package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet {
	public static void main(String[] args) {
		HashSet<Emp> emps=new HashSet<>();
		Emp e1=new Emp("rnd-123","a1",12345);
		Emp e2=new Emp("rnd-123","a1",12345);
		Emp e3=new Emp("rnd-123","b1",12345);
		System.out.println("e1 added:"+emps.add(e1));  //t
		System.out.println("e2 added:"+emps.add(e2));  //identical duplicate -> ideally it should be false but it is true -> WY??
		//the moment we changes from String to Emp -> HashSet is not detetcting duplicates -> Discusion is here
		//here it is calling Object's equals() -> Override equals() in Emp class
		//Even after overrding equals still not able to detect duplicate 
		//Issue is, till now emps.add(e2) is not even invoking overriden equals()
		//to see above points comment overriden hashCode() in Emp class
		//Here comes the famous Contract:
		
		//MUST Override the hashCode, to ensure that equal objects produce same values of the hashcode
		System.out.println("e3 added:"+emps.add(e3));
		System.out.println(e1.equals(e2));  
		System.out.println(e1.hashCode()+" "+e2.hashCode());
		System.out.println("size"+emps.size());
		System.out.println(emps);
			
	}

}
