package abstractclassesandmethods.book.bookmanagement;

import java.util.List;
import java.util.Scanner;

import abstractclassesandmethods.book.dbbook.DBBook;
import abstractclassesandmethods.book.loginmanagement.LoginView;
import abstractclassesandmethods.book.model.Book;

public class BookView {

	private BookModel bookModel;
	
	public BookView() {
		this.bookModel = new BookModel(this);
	}
	
	public void init() {

		showManipulateOption();
	}
	
	public void getBooks() {
		
		bookModel.getBook();		
	}

	public void displayBooks(List<Book> books) {

		System.out.printf("BookId\tBookName\n");
		System.out.println("-------------------------");
		for(Book book : books) {
			System.out.print(book.getBookId()+"\t"+book.getBookName()+"\n");
		}
		System.out.println("------------------------");
	}

	public void showManipulateOption() {
		getBooks();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to update book");
		System.out.println("---------------------------");
		System.out.println("1 -> Edit");
		System.out.println("2 -> Exit");
		System.out.print("Enter Choice : ");
		String choice = scanner.next();
		
		if(choice.equals("1") && DBBook.getDBInstance().isUserLoggedIn()) {
			updateBoook();
		}	
		else if(choice.equals("1"))
		{
			new LoginView().initLogin();
			updateBoook();
		}
		else if(choice.equals("2")) {
			System.out.println("Thank You");
			return;
		}
		else {
			System.out.println("Enter correct option..");
			showManipulateOption();
		}
	}

	private void updateBoook() {
		
		System.out.println("------------------------");
		Scanner scanner = new Scanner(System.in);
		
		try {	

			Book book = new Book();
			System.out.print("Enter Book Name : ");
			book.setBookName(scanner.nextLine());
			System.out.print("Enter book Id : ");
			book.setBookId(scanner.nextInt());
			bookModel.updateBook(book);
			
		} catch (Exception e) {
			System.out.println("Input is invalid..");
			System.out.println("------------------------");
			updateBoook();
		}
	}

	public void showAlert(String msg) {
		
		System.out.println("----------------------");
		System.out.println(msg);
		System.out.println("----------------------");		
	}
}
