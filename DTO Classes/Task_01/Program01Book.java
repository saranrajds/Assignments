package dtoclasswithattributes;

public class Program01Book {

	public static void main(String[] args) {
		Book book = new Book();
	}
}

class Book {

	private String title;
	private String isbn;
	private String author;
	private int pageCount;
	private static int bookCount = 0;

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
