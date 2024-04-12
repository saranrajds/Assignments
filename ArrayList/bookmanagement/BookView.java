package ArrayList.bookmanagement;

import java.util.List;
import java.util.Scanner;

import ArrayList.BookDB;
import ArrayList.Books;

public class BookView {

	BookModel bookModel;
	
	public BookView() {
		
		this.bookModel = new BookModel(this);
	}
	
	public void init() {
		
		addBook();
		updateBook();
		deleteBook();
	}
	
	private void addBook() {
		
		Books book1 = new Books("C");
		bookModel.onAddBook(book1);
		System.out.println();
		Books book2 = new Books("Java");
		bookModel.onAddBook(book2);
		System.out.println();
		Books book3 = new Books("DS");
		bookModel.onAddBook(book3);		
		showAlert("Book Added Successfully..\n\n");
		
	}
	
	private void updateBook() {
		Books book = new Books();
		book.setId(2);
		book.setName("C++");
		bookModel.updateBook(book);
		showAlert("Book Updated Successfully..\n\n");
	}
	
	private void deleteBook() {
		bookModel.deleteBook(2);
		showAlert("Book deleted Successfully..\n\n");
	}

	public void displayBooks(List<Books> books) {
		
		if (books.size() > 0) {
			
			System.out.println("Book Id\t Book Name");
			System.out.println("--------------------");
			books.forEach(book -> {
				System.out.println(book.getId()+"\t\t"+book.getName());
			});
			System.out.println("----------------------");
		} else {
			System.out.println("No Data Found...");
		}	
	}

	public void showAlert(String msg) {
		System.out.println("\n"+msg+"\n");
	}
	
}
