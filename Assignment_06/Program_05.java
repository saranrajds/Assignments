package Assignment_06;

import java.util.Scanner;

public class Program_05 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = s.nextLine();
		
		System.out.println("\n"+capitilize1stLetter(str));
		s.close();	
	}
	
	static String capitilize1stLetter(String str) {
		
		String newStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			 
            char ch = str.charAt(i);

            if ((i == 0 || str.charAt(i-1) == ' ' ) && (ch >= 97 && ch <= 122))             	
            	ch = (char) (((int)ch) - 32);       
            
            newStr = newStr + ch;
        }
		 
		return newStr;
	}
}
