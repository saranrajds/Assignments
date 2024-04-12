package ArrayList.bookmanagement;

import java.util.List;

import ArrayList.BookDB;
import ArrayList.Books;

public class BookModel {

	BookView bookView;
	public BookModel(BookView bookView) {
		this.bookView = bookView;
	}
	
	public void onAddBook(Books book) {

		BookDB.getDBInstance().onAddBook(book);
		getBooks();
	}

	public void getBooks() {
		
		List<Books> books =  BookDB.getDBInstance().getBooks();
		bookView.displayBooks(books);
	}

	public void updateBook(Books book) {		
		BookDB.getDBInstance().onUpdateBook(book);
		getBooks();
	}

	public void deleteBook(int i) {
		
		BookDB.getDBInstance().onDeleteBook(i);
		getBooks();
	}
}
