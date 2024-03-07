package Combined_Assignment_1;

import java.util.Scanner;

public class InstanceVariablesWithDifferentDatatypes {

	public static void main(String[] args) {
		
		ShowProductDetails showProductDetails = new ShowProductDetails();
		showProductDetails.showProductDetails();
	}
}

class ShowProductDetails {	
	
	void showProductDetails() {
		
		Scanner scan = new Scanner(System.in);
		Product product = new Product();	
		
		System.out.print("Enter Product Id : ");
		int productId = scan.nextInt();
		product.setProductId(productId);
		
		System.out.print("Enter Product Name : ");
		String productName = scan.next();
		product.setProductName(productName);
		
		System.out.print("Enter Product Price : ");
		double productPrice = scan.nextDouble();
		product.setProductPrice(productPrice);
		
		System.out.print("The Product is Active (if Active give \"True\" or \"false\"): ");
		boolean isProductActive = scan.nextBoolean();
		
		product.setProductIsActive(isProductActive);
		
		product.showProductDetails();
		scan.close();
	}
}

class Product {
	
	private int productId;
	private String productName;
	private boolean productIsActive;
	private double productPrice;
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductIsActive(boolean productIsActive) {
		this.productIsActive = productIsActive;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	void showProductDetails() {
		System.out.println("productId : "+productId);
		System.out.println("productName : "+productName);
		System.out.println("productIsActive : "+productIsActive);
		System.out.println("productPrice : "+productPrice);
	}
}
