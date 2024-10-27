package p4;
import static utils.CollectionUtils.*;

import java.util.Map;

import com.app.core.Product;

public class Test4 {

	public static void main(String[] args) {
		Map<Integer, Product> map = populateMapFromList(populateData());
		//display product id (key) n product details : forEach : BiConsumer
		//default void forEach​(BiConsumer<? super K,​? super V> action)
		map.forEach((k,v) -> System.out.println("Id "+k+" : "+v));
	}

}
