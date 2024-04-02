package exceptionhanding;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {

		getPhoneNumber();
	}

	private static void getPhoneNumber() {

		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("Enter the Phone number : ");
			long phoneNumber = scanner.nextLong();

			System.out.println("Phone Number " + phoneNumber);

		} catch (InputMismatchException e) {
			System.out.println("Please enter valid phone number");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
