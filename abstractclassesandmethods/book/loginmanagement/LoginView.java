package abstractclassesandmethods.book.loginmanagement;

import java.util.Scanner;

import abstractclassesandmethods.book.model.Credential;

public class LoginView {

	private LoginModel loginModel;

	public LoginView() {
		this.loginModel = new LoginModel(this);
	}

	public void initLogin() {

		Scanner scan = new Scanner(System.in);

		Credential credential = new Credential();
		System.out.println("-------------------------");
		System.out.println("Please Login to Proceed..");
		System.out.print("Enter email Id : ");
		credential.setEmail(scan.next());
		System.out.print("Enter password : ");
		credential.setPassword(scan.next());

		loginModel.isValidateCrediential(credential);
	}

	public void showAlert(String msg) {
		System.out.println("--------------------------");
		System.out.println(msg);
		System.out.println("--------------------------");
	}
}
