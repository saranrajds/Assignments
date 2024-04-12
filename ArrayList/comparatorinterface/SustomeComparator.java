package ArrayList.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ArrayList.Books;

public class SustomeComparator {

	public static void main(String[] args) {
		
		comparatorSort();
	}

	private static void comparatorSort() {
		
		List<Books> books = new ArrayList<Books>();
		books.add(new Books("C"));
		books.add(new Books("Java"));
		books.add(new Books("DS"));
		
		System.out.println("Before Sorting");
		System.out.println("---------------");
		books.forEach(book -> {
			System.out.println(book.getName());
		});
		
		Collections.sort(books, new CusImplementationComparator());
		
		System.out.println("\n\nAfter Sorting");
		System.out.println("---------------");
		books.forEach(book -> {
			System.out.println(book.getName());
		});
	}
}
