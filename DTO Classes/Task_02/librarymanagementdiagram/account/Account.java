package dtoclasswithattributes.librarymanagementdiagram.account;

public class Account {

	private String noBorrowedBooks;
	private String noReservedBooks;
	private String noReturnedBooks;
	private String noLastBooks;
	private double fineAmount;

	public void calculateFine() {
	}

	public String getNoBorrowedBooks() {
		return noBorrowedBooks;
	}

	public void setNoBorrowedBooks(String noBorrowedBooks) {
		this.noBorrowedBooks = noBorrowedBooks;
	}

	public String getNoReservedBooks() {
		return noReservedBooks;
	}

	public void setNoReservedBooks(String noReservedBooks) {
		this.noReservedBooks = noReservedBooks;
	}

	public String getNoReturnedBooks() {
		return noReturnedBooks;
	}

	public void setNoReturnedBooks(String noReturnedBooks) {
		this.noReturnedBooks = noReturnedBooks;
	}

	public String getNoLastBooks() {
		return noLastBooks;
	}

	public void setNoLastBooks(String noLastBooks) {
		this.noLastBooks = noLastBooks;
	}

	public double getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}
}
