package abstractclassesandmethods.product;

public class Cloth extends Product {
	
	public Cloth(String name, double price) {
		super(name, price);
	}
	
	@Override
	public void getDescription() {
		System.out.println("Product Name : "+ getName());
		System.out.println("Product Price : "+ getPrices());
	}

	@Override
	public double getPrice() {
		return getPrices();
	}
}
