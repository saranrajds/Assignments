package OverloadingOverridingPolymorphism;

class Employee {

	private String name;
	private String id;

	public Employee(String name, String id) {
		
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void getEmployeeDetails() {
		System.out.println("Name : " + name);
		System.out.println("Id : " + id);
	}
}

class HourlyEmployee extends Employee {

	private String typeOfEmployee;
	
	public HourlyEmployee(String name, String id, String typeOfEmployee) {
		super(name, id);
		this.typeOfEmployee = typeOfEmployee;
	}
	
	public void getEmployeeDetails() {
		super.getEmployeeDetails();
		System.out.println("Employee Type : " + typeOfEmployee);
	}
}

class SalariedEmployee  extends Employee {

	private String typeOfEmployee;

	public SalariedEmployee(String name, String id, String typeOfEmployee) {
		super(name, id);
		this.typeOfEmployee = typeOfEmployee;
	}
	
	public void getEmployeeDetails() {
		super.getEmployeeDetails();
		System.out.println("Employee Type : " + typeOfEmployee);
	}
}

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee salariedEmployee = new SalariedEmployee("emp10", "Vansnth", "salary");
		salariedEmployee.getEmployeeDetails();
		
		System.out.println("-----------------------");
		Employee hourlyEmployee = new HourlyEmployee("emp20", "Surya", "hours");
		hourlyEmployee.getEmployeeDetails();
	}
}
