package utils;

import static com.app.core.Category.FRUITS;
import static com.app.core.Category.GRAINS;
import static com.app.core.Category.OIL;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.app.core.Product;

public interface CollectionUtils {
	 static List<Product> populateData() {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product(100, "mango", FRUITS, parse("2019-01-01"), 500));
		products.add(new Product(10, "rice_bran", OIL, parse("2019-11-21"), 450));
		products.add(new Product(45, "sunflower", OIL, parse("2019-05-11"), 550));
		products.add(new Product(30, "rice", GRAINS, parse("2019-01-13"), 520));
		products.add(new Product(55, "orange", FRUITS, parse("2020-01-01"), 350));
		products.add(new Product(35, "wheat", GRAINS, parse("2018-07-11"), 700));
		return products;
	}
	 //add a static method : which will copy refs from the List ---> Map
	 static Map<Integer,Product> populateMapFromList(List<Product> list)
	 {
		 Map<Integer,Product> productMap=new HashMap<>();
		 for(Product p : list)
			 productMap.put(p.getId(), p);
		 return productMap;
	 }
	 
	 //add a static method which will accept unsorted and unordered map of products and 
	 // returns sorted
	 static List<Product> sortProductsDescPrice(Map<Integer,Product> products)
	 {	
		 //You can't use TreeMap since TM uses Natueal Order or Custom Ordering but based upon KEY
		 //map(HM) -> now here you want to sort it as per the value based criteria -> Collection view of map
		 // map -> collection of values(values) -> Stream<Product> -- sorted(Comparator) : returns sorted Stream<Prduct> -- collect it in the last (Collector class)
		 
		 //p1.getPrice -> go to Product and see it is returning a primitive type -> Don;t expect a method on primitive type and compiler also don't do auto boxing itself -> you have to do box douible to Double.
		 Comparator<Product> comp=(p1,p2)-> ((Double)p1.getPrice()).compareTo(p2.getPrice());
		 return products.values().stream().sorted(comp).collect(Collectors.toList());
	 }
	 
	 
}
