package Assignment_03;

import java.util.Scanner;

public class Program_03 {

	public static void main(String[] args) {
//		3. Create a program that takes a student's score as input and outputs their corresponding grade.
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter thr mark : ");
		int mark = s.nextInt();
		
		if (mark > 80 && mark <= 100) 
		{
			System.out.println("Grade => : A");
		} 
		else if (mark > 60 && mark <= 80)
		{
			System.out.println("Grade => : B");
		}
		else if (mark >= 40 && mark <= 60)
		{
			System.out.println("Grade => : C");
		}
		else if (mark >= 0 && mark < 40)
		{
			System.out.println("Failed");
		}
		else {
			System.out.println("Mark is incorrect..");
		}
		
		s.close();
	}

}
