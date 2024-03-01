package Assignment_06;

import java.util.Scanner;

public class Program_04 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Emaill : ");
		String email = s.next();	
		
		String str = "Email is Valid";
				
		if(!isValidEmail(email)) 
			str = "Email is Not Valid";
		
		System.out.println(email +" "+ str);
		s.close();		
	}

	private static boolean isValidEmail(String email) {

		if(email.length() > 0 && (email.charAt(0) == '@' || Character.isDigit(email.charAt(0)) || email.charAt(email.length()-1) == '@' ))
			return false;
		
		String[] str = email.split("@");
		
		if(str.length != 2)
			return false;

		if(str.length > 1)
		{
			String[] dots = str[1].split(".");
						
			if(dots.length > 1 && !((dots[1].equals("com")) || (dots[1].equals("in")) || (dots[1].equals("org")) ))
				return false;
			
		}
		
		int index = email.indexOf('@');
		System.out.println("index "+ index +" "+email.charAt(index-1)+" "+email.charAt(index+1));
		
		if(!Character.isLetter(email.charAt(index-1)) || !Character.isLetter(email.charAt(index+1)))
			return false;
		
		for (int i = 0; i < str[0].length(); i++) {
			
			int c = str[0].charAt(i);
			if( c >= 65 && c <= 90) 
				return false;
			
			if(c == '.' && ( (i != 0 && str[0].charAt(i-1) == '.') || (i < str[0].length()-1  && str[0].charAt(i+1) == '.')))
				return false;
		}
		
		return true;
	}
}
