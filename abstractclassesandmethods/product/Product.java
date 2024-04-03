package abstractclassesandmethods.product;

public abstract class Product {
	
	private String name;
	private double prices;
	
	public Product(String name, double price) {
		this.name = name;
		this.prices = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrices() {
		return prices;
	}
	
	public abstract void getDescription();

	public abstract double getPrice();
	
}
