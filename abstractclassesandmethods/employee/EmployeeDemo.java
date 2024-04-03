package abstractclassesandmethods.employee;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {

		getDetails();
	}

	private static void getDetails() {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Hourly Employee:");
        System.out.print("Name: ");
        String hourlyName = scanner.nextLine();
        System.out.print("Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = scanner.nextInt();
		
        Employee hourlyEmployee = new HourlyEmployee(hourlyName, hourlyRate, hoursWorked);
        
        System.out.println("\nEnter details for Salaried Employee:");
        scanner.nextLine();
        System.out.print("Name: ");
        String salariedName = scanner.nextLine();
        System.out.print("Monthly Salary: ");
        double monthlySalary = scanner.nextDouble();

        Employee salariedEmployee = new SalariedEmployee(salariedName, monthlySalary);

        System.out.println("\nHourly Employee Details:");
        hourlyEmployee.getEmployeeDetails();
        System.out.println("Pay: " + hourlyEmployee.calculatePay());
        
        System.out.println("\nSalaried Employee Details:");
        salariedEmployee.getEmployeeDetails();
        System.out.println("Pay: " + salariedEmployee.calculatePay());
	}

}
