package Assignment_06;

import java.util.Scanner;

public class Program_01 {

	public static void main(String[] args) {
//		Create a program to count vowels in a given string using string functions
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = s.nextLine();
		
		System.out.println(getVowelsCount(str));
		s.close();
	}
	
	static int getVowelsCount(String str) {
		
		int count = 0;
		
		 for (int i = 0; i < str.length(); i++) {
			 
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
		return count;
	}
		
}
