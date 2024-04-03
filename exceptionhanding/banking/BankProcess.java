package exceptionhanding.banking;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BankProcess {

	BankDB bankDB = new BankDB();

	public void name() {
		BankDB.getInstance();
	}

	public void init() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter User Information.");
		System.out.println("------------------------");

		try {
			Customer customer = new Customer();
			System.out.print("Enter Customer Name : ");
			String name = scan.nextLine();
			nameValidation(name);
			customer.setCusName(name);

			AccountInfo accountInfo = new AccountInfo();
			System.out.print("Enter Account Number : ");
			String accNo = scan.next();
			numberIsValid(accNo);
			accountInfo.setAccountNumber(accNo);

			customer.setAccountInfo(accountInfo);
			addCusInfo(customer);

		} catch (StringIsValid e) {
			System.out.println(e.getMessage());
			init();
		} catch (NumberIsValid e) {
			System.out.println(e.getMessage());
			init();
		} catch (InputMismatchException e) {
			System.out.println("Input is not valid..");
			init();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			init();
		}
	}

	private void nameValidation(String name) throws StringIsValid {

		String regex = ".*[\\d\\W&&[^\\.]].*";

		if (Pattern.matches(regex, name)) {
			throw new StringIsValid("Name is not valid...");
		}
	}

	private void numberIsValid(String number) throws NumberIsValid {

		String regex = "\\d+";
		if (!Pattern.matches(regex, number)) {
			throw new NumberIsValid("Input is not valid...");
		}
	}

	private void addCusInfo(Customer customer) {

		BankDB.getInstance().insertCusInfo(customer);

		System.out.println("\nCustomer info Successfully Added...");
		System.out.println("\n-------------------------------------\n");
		amountTransferOptions();
	}

	private void amountTransferOptions() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Select Option");
		System.out.println("-------------");
		System.out.println("1 -> Deposite");
		System.out.println("2 -> Withdrawel");
		System.out.println("3 -> Show Balance");
		System.out.print("Enter choich : ");
		int choice = scanner.nextInt();
		int amount = 0;

		try {

			if (choice == 1) {
				System.out.print("Enter amount : ");
				amount = scanner.nextInt();
				createAmount(amount);
			} else if (choice == 2) {
				System.out.print("Enter amount : ");
				amount = scanner.nextInt();
				amountValidation(amount);
				withdrawelAmount(amount);
			} else if (choice == 3) {
				showBalance();
			} else {
				System.out.println("Enter Correct Choice...");
			}
		} catch (InputMismatchException e) {
			System.out.println("Input is not valid...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			checkForBankManagement();
		}
	}

	private long getBalance() {

		return BankDB.getInstance().getBalance();
	}

	private void amountValidation(long amount) throws InsufficientBalance {

		long balance = getBalance();
		if (amount < 1) {
			throw new InsufficientBalance("Amount is Not Valid..");
		} else if (balance < amount) {
			throw new InsufficientBalance("Insufficient Balance..");
		}
	}

	private void createAmount(int amount) {

		BankDB.getInstance().createAmount(amount);
		System.out.println("Amount credited Successfully..");
		showBalance();
	}

	private void showBalance() {
		long balance = getBalance();
		System.out.println("\n----------------------");
		System.out.print("Your Balance : " + balance);
		System.out.println("\n----------------------\n");
	}

	private void withdrawelAmount(int amount) {
		BankDB.getInstance().withdrawelAmount(amount);
		System.out.println("Amount Withdrawel Successfully..");
		showBalance();
	}

	public void checkForBankManagement() {

		System.out.println("\nDo you want to Continue Balance Management? \nType Yes/No");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		if (choice.equalsIgnoreCase("yes")) {
			amountTransferOptions();
		} else if (choice.equalsIgnoreCase("no")) {
			System.out.println("Thank You...");
			return;
		} else {
			System.out.println("\nInvalid choice, \nPlease enter valid choice.\n");
			checkForBankManagement();
		}
	}
}
