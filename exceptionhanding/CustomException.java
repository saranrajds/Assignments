package exceptionhanding;

import java.util.Scanner;

class UserDefinedException extends Exception {

	UserDefinedException(String msg) {
		super(msg);
	}
}

public class CustomException {

	public static void main(String[] args) {
		onAge();
	}

	public static void onAge() {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter Age : ");
			int age = scanner.nextInt();
			checkAge(age);
			System.out.println("Eligible");
		} catch (UserDefinedException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static void checkAge(int age) throws UserDefinedException {

		if (age < 18)
			throw new UserDefinedException("Not Eligibile");
	}
}
