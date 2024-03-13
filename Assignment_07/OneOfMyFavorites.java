
import java.util.Scanner;

public class OneOfMyFavorites {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = s.nextInt();
		System.out.println();
		
		while (number != 1) {
			
			System.out.print(number+" ");
			if(number % 2 == 0)
				number = number / 2;
			else
				number = number*3+1;
		}
		System.out.println("Number "+number);
//		oneOfMyFavorites(number);
	}
	
	private static void oneOfMyFavorites(int number) {
		
		
		System.out.println(number);
		
		if(number == 1)
			return;
		
		if(number % 2 == 0)
			oneOfMyFavorites(number / 2);
		else
			oneOfMyFavorites(number*3+1);
	}

}
