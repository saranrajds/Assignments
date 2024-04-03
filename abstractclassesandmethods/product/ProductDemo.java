package abstractclassesandmethods.product;

import java.util.ArrayList;
import java.util.List;

public class ProductDemo {
	
	public static void main(String[] args) {
				
		List<Product> list = new ArrayList<Product>(); 
		displayInfo(list);
	}

	private static void displayInfo(List<Product> list) {
		
		Book book = new Book("Harry potter", 750);
		list.add(book);
		
		Cloth cloth = new Cloth("T-Shirt", 100);
		list.add(cloth);
		
		Electronics electronics = new Electronics("Samsung Phone", 10000);
		list.add(electronics);
		
		System.out.println("Shopping Cart:");
		double total = 0.0;
		
		for(Product product: list) {
			product.getDescription();
			product.getPrice();
			System.out.println();
			total += product.getPrice();
		}
		System.out.println("Total Price: $" + total);
	}
}
