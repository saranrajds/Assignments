package dtoclasswithattributes;

import java.util.Scanner;

public class Program01Book {

	public static void main(String[] args) {

		Book[] books = new Book[2];
		books[0] = new Book("Java", "ISBN02", "Jemsh", 100);
		books[1] = new Book("C", "ISBN01", "Dennis Ritchie", 50);

		System.out.println("Book Name \t" + "Book Author \t" + "Book Isbn ");
		System.out.println("-----------------------------------------------");
		for (Book book : books) {
			System.out.print(book.getTitle() + "\t\t" + book.getAuthor() + "\t\t" + book.getIsbn() + "\n");
		}
		System.out.println("------------------------------------------------");
		System.out.println("Total Records : " + Book.getBookCount());
	}
}

class Book {

	private String title;
	private String isbn;// International Standard Book Number
	private String author;
	private int pageCount;
	private static int bookCount = 0;

	public Book(String title, String isbn, String author, int pageCount) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.pageCount = pageCount;
		bookCount++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public static int getBookCount() {
		return bookCount;
	}

	public void displayBookDetails() {
		System.out.println("Title: " + title);
		System.out.println("ISBN: " + isbn);
		System.out.println("Author: " + author);
		System.out.println("Page Count: " + pageCount);
	}
}
