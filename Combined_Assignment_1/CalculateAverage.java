package Combined_Assignment_1;

import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		
		CalculateAverage calAvrg = new CalculateAverage();
		calAvrg.calculateAverage();
	}

	private void calculateAverage() {
		
		Scanner scan = new Scanner(System.in);
		int numberOfPeople = 10;
		int[] weight = new int[numberOfPeople];
		int sumOfWeight = 0;
		
		System.out.println("Enter the "+numberOfPeople+" peoples weight one by one");
		for (int i = 0; i < numberOfPeople; i++) {		
			
			weight[i] = scan.nextInt();
			sumOfWeight += weight[i] ;
		}
		
		double averageWeight = (sumOfWeight / (double)numberOfPeople);
		System.out.println("The average weight of "+numberOfPeople+" people is "+averageWeight);
		scan.close();
	}

}
