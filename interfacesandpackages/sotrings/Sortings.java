package interfacesandpackages.sotrings;

public class Sortings implements ISortable {

	public void bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean isSorted = true;
			
			for (int j = 0; j < arr.length-1; j++) {
				
				 if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
			}
			
			if(isSorted)
				break;
		}
		
	}
	
	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
