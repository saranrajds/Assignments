package Assignment_06;

import java.util.Scanner;

public class Program_02 {

	public static void main(String[] args) {
//		2. Write a program to reverse the characters of a string.
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = s.nextLine();
		
		System.out.println(reverseString(str));
		s.close();	

	}

	private static String reverseString(String str) {

		String newStr = "";
		
		 for (int i = str.length()-1; i >= 0; i--) {
			 
            char ch = str.charAt(i);
            newStr += ch;
        }
		
		return newStr;
	}
}
