package Assignment_03;

import java.util.Scanner;

public class Program_05 {

	public static void main(String[] args) {
//		5. Write a program to print factorial of a given number using loop
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter thr Number : ");
		int no = s.nextInt(), fact = 0;
		
		fact = no;
		
		while (--no > 0) {
			
			fact *= no;
		}
		
		System.out.println(fact);
	}

}
