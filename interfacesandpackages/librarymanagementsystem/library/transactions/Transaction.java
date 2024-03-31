package interfacesandpackages.librarymanagementsystem.library.transactions;

import java.util.List;

import interfacesandpackages.librarymanagementsystem.library.books.Book;
import interfacesandpackages.librarymanagementsystem.library.members.Member;

public class Transaction {

	private Book books;
	private Member members;

	public Book getBooks() {
		return books;
	}

	public void setBooks(Book books) {
		this.books = books;
	}

	public Member getMembers() {
		return members;
	}

	public void setMembers(Member members) {
		this.members = members;
	}
}
