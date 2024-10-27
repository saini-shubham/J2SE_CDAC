package string;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("0P"));

	}
	
	 public static  boolean isPalindrome(String s) {
	        List<Character> list = new ArrayList<Character>();
	        for(Character chr:s.toLowerCase().toCharArray()){
	            int ascii = (int)chr;
	            if( (64 < ascii && ascii < 91) || (96< ascii && ascii < 123) || (ascii >= 48 && ascii <= 57)) list.add(chr);

	        }
	        int i = 0;
	        int j = list.size()-1;
	        while(i < j) {
	        	System.out.println(list.get(i)+"  "+list.get(j));
	        	if(list.get(i) != list.get(j))
	        		return false;
	        	i++;
	        	j--;
	        }
	        return true;
	    }

}
