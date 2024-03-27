package dtoclasswithattributes;

public class Employee {
	
	private final int BASIC_SALARY = 1000;
	private String name;
	private int employeeId;
	private String email;
	private String phoneNumber;
	private String address;
	private static int companyName = 0;
	private double salary;
	private double attendanceDays;
	
	public double getAttendance() {
		return attendanceDays;
	}

	public void setAttendance(double attendance) {
		this.attendanceDays = attendance;
	}

	public double getSalary() {
		return (salary * attendanceDays) + BASIC_SALARY;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static int getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(int companyName) {
		Employee.companyName = companyName;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("CompanyName "+ companyName);
		System.out.println("Name "+ name);
		System.out.println("Email "+ email);
		System.out.println("Phone Number "+ phoneNumber);
		System.out.println("Address"+ address);
	}
}
