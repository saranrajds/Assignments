package abstractclassesandmethods.product;

public class Book extends Product {
	
	public Book(String name, double price) {
		super(name, price);
	}
	
	@Override
	public void getDescription() {
		System.out.println("Book Name : "+ getName());
		System.out.println("Book Price : "+  getPrices());
	}

	@Override
	public double getPrice() {
		return getPrices();
	}
}
