package interfacesandpackages.librarymanagementsystem.library;

import interfacesandpackages.librarymanagementsystem.library.books.Book;
import interfacesandpackages.librarymanagementsystem.library.members.Member;
import interfacesandpackages.librarymanagementsystem.library.transactions.Transaction;

public class LIbrary {

	public static void main(String[] args) {

		Book book = new Book();
		book.setTitle("Dream");
		
		Member member = new Member();
		member.setName("Sujith");
		
		Transaction transactions = new Transaction();
		transactions.setBooks(book);
		transactions.setMembers(member);
		
        System.out.println("Book: " + transactions.getBooks().getTitle());
        System.out.println("Member: " + transactions.getMembers().getName());
				 
	}
}
