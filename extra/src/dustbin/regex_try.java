package dustbin;


public class regex_try {
	public static void main(String[] args) {
		String regex="[@$%]*";
		String pattern="@";
				if(pattern.matches(regex))
					System.out.println("asd");
				else
					System.out.println("Fail");
//		if((Pattern.matches("[@]","dsafa@" )))
//			System.out.println("hye keep going");
//		else
//			System.out.println("keep going with x2");
	}

}
