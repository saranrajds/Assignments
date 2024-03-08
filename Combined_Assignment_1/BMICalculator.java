package Combined_Assignment_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		PersonBMI personBMI = new PersonBMI();
		personBMI.getPersonBIM();
	}
}

class Person {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public String getWeightStatus() {
		return weightStatus;
	}
	public void setWeightStatus(String weightStatus) {
		this.weightStatus = weightStatus;
	}
	
	private String name;
	private double heigth;
	private double weigth;
	private String weightStatus;
}

class PersonBMI {
	
	List<Person> personList = new ArrayList<Person>();
	
	void getPersonBIM() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number of persons : ");
		int numberOfPersons = s.nextInt();
		
		for (int i = 0; i < numberOfPersons; i++) {

			System.out.println("Enter "+(i+1)+" Person details:");
			System.out.println("Enter Name : ");
			String name = s.next();
					
		    System.out.print("Enter weight in kilograms: ");
		    double weight = s.nextDouble();
		
		    System.out.print("Enter height in meters: ");
		    double height = s.nextDouble();
		    
		    double bmi = weight / (height * height);
		    String status = getStatus(bmi);

		    Person person = new Person();
		    person.setName(name);
		    person.setHeigth(height);
		    person.setWeigth(weight);
		    person.setWeightStatus(status);		    
		    personList.add(person);
		}
		
		PersonBMI personBIM = new PersonBMI();
		Collections.sort(personList, new SortUsingComparator());
		personBIM.showPersonDetails(personList);
	}
	
	void showPersonDetails(List<Person> personList) {
		
		String header = String.format("%s %10s %8s", "Name", "BMI", "Remark");
		System.out.println(header);
		System.out.println("----------------------------------");
		for(Person person : personList)
		{
			String str = String.format("%s %10.1f %8s", person.getName(), person.getWeigth(), person.getWeightStatus());
			System.out.println(str);
		}
	}
	
	String getStatus(double bmi) {
		
		String status = "Obesity";
		
		if (18.5 < bmi) {
			status = "Underweight";
		} 
		else if(18.5 >= bmi &&  bmi <= 24.9) {
			status = "Healthy Weight";
		}
		else if(25.0 >= bmi &&  bmi <= 29.9) {
			status = "Overweight";
		}		
		return status;
	}
}

class SortUsingComparator implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {		
		
		if(person1.getWeigth() > person2.getWeigth())
			return -1;
		else if(person1.getWeigth() < person2.getWeigth())
			return 1;
		return 0;
	}
	
}
