package abstractclassesandmethods.product;

public class Electronics extends Product {
	
	public Electronics(String name, double price) {
		super(name, price);
	}
	
	@Override
	public void getDescription() {
		System.out.println("Electronic Name : "+ getName());
		System.out.println("Electronic Price : "+ getPrices());
	}

	@Override
	public double getPrice() {
		return getPrices();
	}
}
