package Assignment_02;

import java.util.Scanner;

public class Program_04 {

	public static void main(String[] args) {
//		4. Write a program to calculate a person's Body Mass Index on user input for weight and height. Get BMI formula from the internet.

		Scanner s = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = s.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = s.nextDouble();
        
        double bmi = weight / (height * height);
        System.out.println("BMI is: " + bmi);

        s.close();
	}

}
