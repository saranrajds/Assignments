package Assignment_03;

import java.util.Scanner;

public class Program_04 {

	public static void main(String[] args) {

//		4. Write a program to print multiplication table of a given number in a neat format
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter thr Number : ");
		int no = s.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i +" x "+no+" = "+(i*no));
		}
		
		s.close();

	}

}
