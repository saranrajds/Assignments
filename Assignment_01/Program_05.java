package Assignment_01;

public class Program_05 {

	public static void main(String[] args) {
		
//		5. Write a program to swap the two given numbers.​
		
		int numberOne = 10, numberTwo = 20;
		numberOne = numberOne + numberTwo;
		numberTwo = numberOne - numberTwo;
		numberOne = numberOne - numberTwo;
		System.out.println("numberOne => "+numberOne+" numberTwo => "+numberTwo);
	}

}
