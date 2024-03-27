package dtoclasswithattributes.librarymanagementdiagram.librarian;

import java.util.List;

import dtoclasswithattributes.librarymanagementdiagram.book.Book;

public class Librarian {

	private String name;
	private int id;
	private String password;
	private String searchString;
	public List<Book> books;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
}
