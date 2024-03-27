package dtoclasswithattributes.librarymanagementdiagram.loginmanagement;

import java.util.List;

import dtoclasswithattributes.librarymanagementdiagram.book.Book;
import dtoclasswithattributes.librarymanagementdiagram.librarian.Librarian;
import dtoclasswithattributes.librarymanagementdiagram.usermanagement.User;

public class LoginManagement {

	private String userType;
	private String userName;
	private String password;
	public List<Book> books;
	public List<User> users;
	public Librarian librarian; 
	
	public void login() {
	}

	public void register() {
	}

	public void logOut() {
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
