package interfacesandpackages.sotrings;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] arr = { 5, 6, 2, 7, 4, 1, 3 };
		ISortable sortings = new Sortings();
		System.out.println("1 -> Bubble Sort");
		System.out.println("2 -> Quick Sort");
		System.out.println("3 -> Merge Sort");
		System.out.print("Enter the Choice : ");
		String choice = scanner.next();

		switch (choice) {
		case "1":
			System.out.println("-------Bubble Sort-------\n");
			sortings.bubbleSort(arr);
			break;
		case "2":
			System.out.println("\n-------Quick Sort-------\n");
			sortings.quickSort(arr, 0, arr.length - 1);
			sortings.printArray(arr);
			break;
		case "3":
			System.out.println("\n-------Merge Sort-------\n");
			sortings.mergeSort(arr, 0, arr.length - 1);
			sortings.printArray(arr);
			break;
		default:
			System.out.println("Wrong Choice...");
			break;
		}
	}
}
