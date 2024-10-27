package dustbin;

public class try2 {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String(s1);
		String s4=s3.intern();
		String s9=new String(s1.toUpperCase());
                 String s10=s9.intern();
		//concat vs + operator
		String s5="he"+"llo";
		String s6="he".concat("llo"); 
		System.out.println(s1==s2);        //t
		System.out.println(s1==s3);        //f
		System.out.println(s1==s4);       //t
		System.out.println(s1==s5);         //t
System.out.println(s1==s6);          //f
	}
}
