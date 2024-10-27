package dustbin;

public class try1 {

	public static void main(String[] args) {
		String s="Hello";
		s.toUpperCase();
		s.concat("12345");
		System.out.println(s);
		String s1="testing strings";
		String s2=new String(s1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3="He"+"llo";
		String s4="He".concat("llo");
		String s5="hello";
		System.out.println(s==s3);
		System.out.println(s==s4);
		System.out.println(s==s5);
	}

}
