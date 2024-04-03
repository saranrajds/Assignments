package abstractclassesandmethods.book.bookmanagement;

import java.util.List;

import abstractclassesandmethods.book.dbbook.DBBook;
import abstractclassesandmethods.book.model.Book;

public class BookModel {

	private BookView bookView;
	
	public BookModel(BookView bookView) {
		
		this.bookView = bookView;		
	}

	public void getBook() {
		
		List<Book> books = DBBook.getDBInstance().getBook();
		bookView.displayBooks(books);
	}

	public void updateBook(Book book) {
		
		boolean isAdded =  DBBook.getDBInstance().updateBook(book);
		
		if(isAdded) {
			bookView.showAlert("Book Updated Successfully...");
		}
		else {
			bookView.showAlert("Book Not Updated...");
		}
		bookView.showManipulateOption();
	}	
}
