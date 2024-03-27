package OverloadingOverridingPolymorphism;

class Math {
	
	 public int add(int a, int b) {
        return a + b;
	 }

	 public double add(double a, double b) {
		 return a + b;
	 }
	 
	 public int subtract(int a, int b) {
        return a - b;
     }

	 public double subtract(double a, double b) {
        return a - b;
	 }
	 
	 public int multiple(int a, int b) {
        return a * b;
     }

	 public double multiple(double a, double b) {
        return a * b;
	 }
	 
	 public int division(int a, int b) {
		
		 if(b == 0) {
			 System.out.println("Cannot divide by zero");
			 throw new ArithmeticException();
		 }
		
        return a / b;
     }

	 public double division(double a, double b) {
		 
		 if(b == 0.0) {
			 System.out.println("Cannot divide by zero");
			 throw new ArithmeticException();
		 }
		 return a / b;
	 }
}


public class MathOperations {

	public static void main(String[] args) {
		
		Math math = new Math();
		System.out.println("Add "+ math.add(10, 10));
		System.out.println("Sub "+ math.subtract(10, 10));
		System.out.println("Multiple "+ math.multiple(10, 10));
		System.out.println("Division "+ math.division(10, 10));
	}
}
