package arrays;

import java.util.Scanner;

public class Array2 {

	    // Complete the function
	    // str: input string
	    public static String reverseWord(String str)
	    {   
	            String s="";
	            for(int i = str.length()-1;i>=0;i--)
	                s+=str.charAt(i);
	            return s;
	     }
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter a string");
	    	String s= reverseWord(sc.next());
	    	System.out.println(s);
	    }
	    

}
