package abstractclassesandmethods.book.loginmanagement;

import abstractclassesandmethods.book.dbbook.DBBook;
import abstractclassesandmethods.book.model.Credential;

public class LoginModel{

	private LoginView loginView;

	public LoginModel(LoginView loginView) {
		this.loginView = loginView;
	}

	public void isValidateCrediential(Credential credential) {
		
		boolean isValid = DBBook.getDBInstance().isValidateCrediential(credential);
		
		if(!isValid) {
			loginView.showAlert("In-Correct Credential..");
			loginView.initLogin();
		}else {
			loginView.showAlert("Logged in Successfully..");
		}
	}
}
