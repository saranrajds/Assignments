package exceptionhanding;

import java.util.Scanner;

public class DivedByZero {

	public static void main(String[] args) {

		divition();
	}

	public static void divition() {

		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();
            
            int result = dividend/divisor;
			System.out.println("Result : "+result);
		}
		catch (ArithmeticException e) {
				System.out.println(e.getMessage());
		}		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			scanner.close();
		}
	}
}
