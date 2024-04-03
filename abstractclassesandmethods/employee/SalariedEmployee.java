package abstractclassesandmethods.employee;

public class SalariedEmployee extends Employee{
	
	private double monthlySalary;
	
	public SalariedEmployee(String name, double monthlySalary) {
		super(name, "Salaried Employee");
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculatePay() {
		return monthlySalary;
	}
}
