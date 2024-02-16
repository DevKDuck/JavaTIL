package Stream;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		
		List<Product> listProduct = new ArrayList<>();
		  for(int i=1; i<=5; i++) {
	         listProduct.add(new Product(i, "상품"+i, "멋진회사", (int)(10000*Math.random())));
	      }
		  
	      listProduct.add(new Product(1, "상품1", "멋진회사", (int)(10000*Math.random())));
	      
	      listProduct.stream()
	      .forEach(p -> System.out.println(p));
	      System.out.println();
	      
		
	}

}
