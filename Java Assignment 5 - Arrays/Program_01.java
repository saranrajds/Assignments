package Assignment_05;

import java.util.Scanner;

public class Program_01 {

	public static void main(String[] args) {
//		1. Create a program that rotates the elements of an array to the right by a specified number of positions. 
//		Get the array and the rotation count from the user
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of time to totate : ");
		int n = s.nextInt();
		int[] arr = {1, 2, 3, 4, 5};
		
		if (n > 0 && arr.length > 0) {
			
			for (int i = 0; i < n; i++) {
				
				int lastIndexValue = arr[arr.length-1];

				for (int j = arr.length-2; j >= 0; j--) {		
					arr[j+1] = arr[j];
				}
				
				arr[0] = lastIndexValue;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		s.close();

	}
		
}
