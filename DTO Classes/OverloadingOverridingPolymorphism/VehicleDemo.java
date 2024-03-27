package OverloadingOverridingPolymorphism;

abstract class Vehicle{
	
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
	
	abstract void run();
	abstract void stop();
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

	@Override
	void run() {
		System.out.println("Car Running");
	}

	@Override
	void stop() {
		System.out.println("Car Stop");
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
	
	@Override
	void run() {
		System.out.println("Motorcycle Running");
	}

	@Override
	void stop() {
		System.out.println("Motorcycle Stop");
	}
}

public class VehicleDemo {

	public static void main(String[] args) {
		
		Car car = new Car("Toyota", "White", 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Black", 2);        
        car.run();
        car.stop();
        System.out.println("---------------");
        motorcycle.run();
        motorcycle.stop();
	}
}
