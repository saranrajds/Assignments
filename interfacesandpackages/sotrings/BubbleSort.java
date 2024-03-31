package interfacesandpackages.sotrings;

public class BubbleSort {

	public static void main(String[] args) {
		
		Sortings sortings = new Sortings();
		
		int[] arr = {3, 2, 5, 9, 6, 1, 7, 4};
		sortings.bubbleSort(arr);
		sortings.printArray(arr);
	}

	
}
