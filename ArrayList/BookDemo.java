package ArrayList;

import ArrayList.bookmanagement.BookView;

public class BookDemo {

	private static BookDemo bookDemo;
	
	private static BookDemo getInstance() {
		
		if(bookDemo == null) {
			bookDemo =  new BookDemo();
		}
		return bookDemo;
	}
	
	private void start() {
		BookView bookView = new BookView();
		bookView.init();
	}
	
	public static void main(String[] args) {
		
		BookDemo.getInstance().start();
	}

}
