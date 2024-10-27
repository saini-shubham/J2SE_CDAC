package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs= new HashSet<>();
		String[] strings={"one","two","three","four","five","one","yellow","zen","stable"};
		//Populate HS using string[]
		// why can't use addall() to populate ? 
		for(String s: strings) {
			
			System.out.println("Added"+hs.add(s));
		}
		System.out.println("sizee:"+hs.size());
		System.out.println("HS"+hs);
		System.out.println(hs.add("tree"));
		System.out.println("Element foound"+hs.contains("zen"));  //t
		//can you attach an itterator to the HS? : YES
		Iterator<String> itr=hs.iterator();
		System.out.println(itr.getClass());		//HashSet$Itr -> maintains HashMap<K<V> -> HashMap.KeyIterator
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
				
		}
		// do try removing specific element itr's remove
		System.out.println("removing elem using Set API "+hs.remove("zen"));
		System.out.println("zen exists "+hs.contains("zen"));//f
		System.out.println(hs);
	}

}
