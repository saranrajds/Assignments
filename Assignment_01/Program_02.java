package Assignment_01;

import java.util.Scanner;

enum days{
	SUNDAY(1),
	MONDAY(2),
	TUESDAY(3),
	WEDNASDAY(4),
	THURSDAY(5),
	FRIDAY(6),
	SATURDAY(7);

	int i;
	days(int i) {
		this.i = i;
	}
}

public class Program_02 {

	public static void main(String[] args) {

	//2. Write a Java program that gets a number from the user and displays the name of the weekday. Use enum.
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number between 1 to 7 : ");
		int no = s.nextInt();
		
		if (days.SUNDAY.ordinal() == no) 
			System.out.println("SUNDAY");
		else if(days.MONDAY.ordinal() == no)
			System.out.println("SUNDAY");
		else if(days.TUESDAY.ordinal() == no)
			System.out.println("TUESDAY");
		else if(days.WEDNASDAY.ordinal() == no)
			System.out.println("WEDNASDAY");
		else if(days.THURSDAY.ordinal() == no)
			System.out.println("THURSDAY");
		else if(days.FRIDAY.ordinal() == no)
			System.out.println("FRIDAY");
		else if(days.SATURDAY.ordinal() == no)
			System.out.println("SATURDAY");
		else
			System.out.println("Wrong Inpur...");
		
		System.out.println(days.SATURDAY);
		System.out.println(days.SATURDAY.ordinal());
		
		
		s.close();
	}

}
