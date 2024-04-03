package abstractclassesandmethods.book.dbbook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import abstractclassesandmethods.book.model.Book;
import abstractclassesandmethods.book.model.Credential;

public class DBBook {

	private static DBBook dbBook;
	private List<Book> books = new ArrayList<Book>();
	private List<Credential> credentials = new ArrayList<Credential>();
	private int loggedInUserId = 0;

	DBBook() {
		Credential credential = new Credential();
		credential.setEmail("123");
		credential.setPassword("123");
		credential.setId(1);
		this.credentials.add(credential);
		
		Book book1 = new Book(1, "C Programming");
		Book book2 = new Book(2, "Java Programming");
		Book book3 = new Book(3, "DS");
		books.add(book1);
		books.add(book2);
		books.add(book3);
	}

	public static DBBook getDBInstance() {

		if (dbBook == null)
			dbBook = new DBBook();
		return dbBook;
	}

	public boolean isValidateCrediential(Credential credential) {

		List<Credential> user = credentials.stream().filter(user_ -> user_.getEmail().equals(credential.getEmail())
				&& user_.getPassword().equals(credential.getPassword())).toList();
		
		if(user.size() > 0)
		{
			this.loggedInUserId = user.get(0).getId();
		}
		return user.size() > 0;
	}

	public List<Book> getBook() {
		return books;
	}

	public boolean isUserLoggedIn() {
		return loggedInUserId > 0;
	}

	public boolean updateBook(Book pBook) {
		
		for(Book book: books) {
			
			if(book.getBookId() == pBook.getBookId())
			{
				book.setBookName(pBook.getBookName());
				return true;
			}
		}
		return false;
	}
}
