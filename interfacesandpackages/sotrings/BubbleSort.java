package interfacesandpackages.sotrings;

public class BubbleSort {

	public static void main(String[] args) {
		
		ISortable sortings = new Sortings();
		
		int[] arr = {5, 6, 34, 7, 6, 3, 5};
		
		System.out.println("-------Bubble Sort-------\n");
		sortings.bubbleSort(arr);
		sortings.printArray(arr);
		System.out.println("\n-------Quick Sort-------\n");
		sortings.quickSort(arr, 0, arr.length-1);
		sortings.printArray(arr);
		System.out.println("\n-------Merge Sort-------\n");
		sortings.mergeSort(arr, 0, arr.length-1);
		sortings.printArray(arr);
	}
}
