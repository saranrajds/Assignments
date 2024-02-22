package Assignment_02;

import java.util.Scanner;

public class Program_02 {

	public static void main(String[] args) {
//		2. Write a program to solve a quadratic equation (ax^2+bx+c). Take a,b and c from user and use quadratic formula.
		
		Scanner s = new  Scanner(System.in);
		
		System.out.print("Enter a value : ");
		double a = s.nextDouble();
		
		System.out.print("\nEnter b value : ");
		double b = s.nextDouble();
		
		System.out.print("\nEnter c value : ");
		double c = s.nextDouble();
		
		double dis = b*b - 4 * a* c;
		
		if (dis > 0) {
			
           double root1 = (-b + Math.sqrt(dis)) / (2 * a);
           double root2 = (-b - Math.sqrt(dis)) / (2 * a);
           System.out.println("Root 1 = " + root1);
           System.out.println("Root 2 = " + root2);
		} else if (dis == 0){
			double root = -b / (2 * a);
			System.out.println("Root = " + root);
		}
		else {
			System.out.println("The equation has no real root");
		}
		s.close();
	}

}
