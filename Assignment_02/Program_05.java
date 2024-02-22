package Assignment_02;

import java.util.Scanner;

public class Program_05 {

	public static void main(String[] args) {
//		5. Write a program to convert time entered in seconds to HH:mm:ss format
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the seconds : ");
		int sec = s.nextInt();
		
		int remSecFromHours = sec % 3600;
		int remSecFromMinuets = remSecFromHours % 60;
		
		System.out.print(sec/3600 +" HH : "+remSecFromHours/60 +" MM :"+remSecFromMinuets +" SS ");
		
		s.close();

	}

}
