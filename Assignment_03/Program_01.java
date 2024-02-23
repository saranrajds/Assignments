package Assignment_03;

import java.util.Scanner;

public class Program_01 {

	public static void main(String[] args) {
		
//		1. Take three numbers from the user and print the greatest number.
		
		Scanner s = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0;
		
		System.out.print("Enter the number A value : ");
		a = s.nextInt();
		System.out.print("Enter the number B value : ");
		b = s.nextInt();
		System.out.print("Enter the number C value : ");
		c = s.nextInt();
		
		int larger = a;
		
		if (larger < b) {
			larger = b;
		} 
		
		if (larger < c) {
			larger = c;
		}
		
		System.out.println("larger "+larger);
		s.close();

	}

}
