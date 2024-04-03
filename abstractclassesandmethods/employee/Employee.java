package abstractclassesandmethods.employee;

public abstract class Employee {


	private String name;
	private String type;
	
	public Employee(String name, String type) {
		
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double calculatePay();
	
	public void getEmployeeDetails() {
		System.out.println("Employee Name : "+ getName());
	}
}
