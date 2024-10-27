package dustbin;

import java.util.ArrayList;
public class IntegerList {

	public static void main(String[] args) {
		ArrayList<Integer> list1= new ArrayList<>() ;
		int[] data= {12,213,34,12,3,123,123,12,21};
		for(int i:data) 
			list1.add(i);
		System.out.println("AL contecnt"+list1);
		System.out.println("Al size"+list1.size());
		for(int i: list1)
			System.out.println(i);
		for(int i=0;i<list1.size()-1;i++)
			System.out.println(list1.get(i));
		list1.add(1000);
		System.out.println("After add"+list1);

		
	}

}
