package dtoclasswithattributes.librarymanagementdiagram.usermanagement;

import java.util.List;

import dtoclasswithattributes.librarymanagementdiagram.account.Account;
import dtoclasswithattributes.librarymanagementdiagram.book.Book;

public class User {

	private String name;
	private int id;
	private Account account;
	public List<Book> books;
	
	public void verify() {
	}
	
	private void checkAccount() {
	}
	
	private void getBookInfo() {
	}

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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}	
}
