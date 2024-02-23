package Assignment_03;

import java.util.Scanner;

public class Program_02 {

	public static void main(String[] args) {
		
//		2. Write a Java program to find the number of days in a given month and year.
		
		Scanner s = new Scanner(System.in);
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
		System.out.print("Entert the Month : ");
		int month = s.nextInt();
		System.out.print("Entert the year : ");
		int year = s.nextInt();
		int days = 0;
		
		if(month > 12 && month < 0)
		{
			System.out.println("Incorrect month");
		}
		else {
			if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) 
				daysInMonth[1] = 29;	
		
			int temp = month;			
			while(temp <= 12)
			{
				days += daysInMonth[temp-1];
				temp++;
			}			
			System.out.println(daysInMonth[month-1]+" "+days);
		}
		s.close();

	}
}
