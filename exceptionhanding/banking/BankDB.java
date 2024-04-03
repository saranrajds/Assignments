package exceptionhanding.banking;

public class BankDB {

	private static BankDB bankDB;
	private Customer customer;
	
	public static BankDB getInstance() {
		
		if(bankDB == null)
			bankDB = new BankDB();
		
		return bankDB;
	}

	public void insertCusInfo(Customer customer) {
		
		this.customer = customer;
	}

	public long getBalance() {

		return customer.getAccountInfo().getAmount();
	}

	public void createAmount(int amount) {
		
		long balance = customer.getAccountInfo().getAmount();
		customer.getAccountInfo().setAmount(amount+balance);		
	}

	public void withdrawelAmount(int amount) {
		long balance = customer.getAccountInfo().getAmount();
		customer.getAccountInfo().setAmount(balance-amount);
	}
}
