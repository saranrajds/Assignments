package Assignment_06;

import java.util.Scanner;

public class Program_03 {

	public static void main(String[] args) {
//		Write a program to reverse the words in a sentence.

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = s.nextLine();
		
		System.out.println(reverseWordInString(str));
		s.close();	
	}
	
	static String reverseWordInString(String str) {
		
		String newStr = "";
		int lastIndex = 0;
		
		 for (int i = 0; i < str.length(); i++) {
			 
            char ch = str.charAt(i);

            if (ch == ' ') {
                newStr = " "+str.substring(lastIndex, i) + newStr;
                lastIndex = i+1;
            }
        }
		 
		newStr = str.substring(lastIndex, str.length()) + newStr;
		return newStr;
	}
}
