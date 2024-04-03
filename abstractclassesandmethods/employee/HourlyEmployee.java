package abstractclassesandmethods.employee;

public class HourlyEmployee extends Employee {

	private double hourlyRate;
    private int hoursWorked;
    
	public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
		super(name, "Hourly Employee");
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculatePay() {	
		return hourlyRate * hoursWorked;
	}
}
