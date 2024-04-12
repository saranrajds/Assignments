package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class BookDB {

	private static BookDB bookDB;
	private List<Books> books = new ArrayList<Books>();
	private int bookId = 0;
	public static BookDB getDBInstance() {
		
		if(bookDB == null) {
			bookDB = new BookDB();
		}
		return bookDB;
	}
	
	public void onAddBook(Books book) {
		
		book.setId(++bookId);
		books.add(book);
	}
	
	public boolean onUpdateBook(Books tempBook) {

		if(books.stream().anyMatch(book -> book.getId() == tempBook.getId())) 
		{
			books = books.stream()
					.map(tBook -> {						
						if( tBook.getId() == tempBook.getId()) {
							tBook.setName(tempBook.getName());
						}
						return tBook;
					}).toList();
			
			return true;
		}else 
			return false;
	}
	
	public boolean onDeleteBook(int bookId) {
		
		if(books.stream().anyMatch(book -> book.getId() == bookId)) {
		
			books = books.stream().filter(book -> book.getId() != bookId).toList();
			return true;
		}else 
			return false;
	}
	
	public List<Books> getBooks() {
		return books;
	}
}
