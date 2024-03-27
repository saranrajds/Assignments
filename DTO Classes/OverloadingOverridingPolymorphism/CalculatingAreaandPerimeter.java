package OverloadingOverridingPolymorphism;

abstract class Shape {
	
	private double base;
	private double heigth;
	private double redius;
	private final double PI = 3.14;
	
	Shape(double base, double heigth) {
		this.base = base;
		this.heigth = heigth;
	}
	
	Shape(double redius) {
		this.redius =  redius;
	}
	
	abstract double area();
	
	public double getPI() {
		return PI;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getRedius() {
		return redius;
	}

	public void setRedius(double redius) {
		this.redius = redius;
	}
	
}

class Rectangle extends Shape {

	Rectangle(double base, double heigth) {
		super(base, heigth);
	}

	@Override
	double area() {
		return this.getBase() * this.getHeigth();
	}

}

class Circle extends Shape{

	public Circle(double redius) {
		super(redius);
	}
	
	@Override
	double area() {
		return getPI() * getRedius() * getRedius();
	}
}

class Triangle extends Shape{

	Triangle(double base, double heigth) {
		super(base, heigth);
	}
	
	@Override
	double area() {
		return 0.5 * this.getBase() * this.getHeigth();
	}
}

public class CalculatingAreaandPerimeter {

	public static void main(String[] args) {
	}
}
