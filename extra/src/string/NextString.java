package string;

public class NextString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(nextCharString("Abc0"));

	}
	
	
	public static String nextCharString(String str) {
		StringBuilder res = new StringBuilder();
		for(int i : str.toCharArray()) {
			res.append((char)(i+1));
		}
		
		return res.toString();
	}

}
