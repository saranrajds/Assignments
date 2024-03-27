package dtoclasswithattributes;

class Vehicle{
	
	private String brand;
	private String color;
	
	Vehicle(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
	
	void displayVehicleInfo() {
		System.out.println("Brand "+brand);
		System.out.println("Color "+color);
	}
}

class Car extends Vehicle {
	
	int numberOfWheele;

	Car(String brand, String color, int numberOfWheele) {
		
		super(brand, color);
		this.numberOfWheele = numberOfWheele;
	}
	
	void displayCarInfo() {
		super.displayVehicleInfo();
		System.out.println("Wheeles "+numberOfWheele);
	}
}

class Motorcycle extends Vehicle {
	
	private int numberOfWheele;
	
	Motorcycle(String brand, String color, int numberOfWheele) {
		super(brand, color);
		this.numberOfWheele = numberOfWheele;
	}
	
	void displayMotorcycleInfo() {
		super.displayVehicleInfo();
		System.out.println("Wheeles "+numberOfWheele);
	}
}

public class VehicleDemo {

	public static void main(String[] args) {

	    Car car = new Car("Toyota", "White", 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Black", 2);
        
        System.out.println("Car Information:");
        System.out.println("----------------");
        car.displayCarInfo();
        System.out.println();
        System.out.println("Motorcycle Information:");
        System.out.println("----------------");
        motorcycle.displayMotorcycleInfo();
	}
}
