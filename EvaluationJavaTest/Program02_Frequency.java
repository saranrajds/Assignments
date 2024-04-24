package javaevaluationquestion;

import java.util.ArrayList;

public class Program02_Frequency {

	public static void main(String[] args) {

		int n = 8;
		int[] arr = { 4, 1, 2, 3, 1, 2, 5, 2 };
		int[] arr2 = { 4, 14, 42, 13, 13, 13, 5, 2 };
		int[] arr3 = { 4, 1, 2, 3, 1, 2, 5, 2 };

		int[] fre = new int[n];
		getFrequecy(arr, fre);

		displayArray(arr);
		displayArray(fre);
		sortArray(arr, fre);
		displayArray(arr);
		displayArray(fre);
		System.out.println("--------------");
		displayArray(arr, fre);
	}

	private static void displayArray(int[] arr, int[] fre) {
		ArrayList list = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < fre[i]; j++) {
				
				if(!list.contains(arr[i])) {
					System.out.print(arr[i]);
				}
			}
			list.add(arr[i]);
		}
	}

	private static void sortArray(int[] arr, int[] fre) {

		for (int i = 0; i < fre.length; i++) {
			
			for (int j = i+1; j < fre.length; j++) {
				
				if(fre[i] < fre[j]) {
					
					int temp = fre[i];
					fre[i] = fre[j];
					fre[j] = temp;
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	private static void displayArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void getFrequecy(int[] arr, int[] fre) {

		for (int i = 0; i < arr.length; i++) {

			int count = 0;
			for (int j = i; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}
			}
			fre[i] = count;
		}
	}

}
