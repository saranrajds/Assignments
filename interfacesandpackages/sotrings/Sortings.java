package interfacesandpackages.sotrings;

public class Sortings implements ISortable {

	public void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			boolean isSorted = true;

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSorted = false;
				}
			}

			if (isSorted)
				break;
		}
	}

	public void quickSort(int[] arr, int low, int high) {

		if (low < high) {

			int pi = portition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}

	}

	private int portition(int[] arr, int low, int high) {

		int pivot = arr[high], i = low - 1;
		for (int j = low; j < high; j++) {

			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public void mergeSort(int[] arr, int l, int r) {

		if (l < r) {

			int mid = (l + r) / 2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);

			merge(arr, l, mid, r);
		}
	}

	private void merge(int[] arr, int l, int mid, int r) {

		int n1 = mid - l + 1;
		int n2 = r - mid;
		int[] lArr = new int[n1];
		int[] rArr = new int[n2];

		for (int i = 0; i < n1; i++) {
			lArr[i] = arr[l + i];
		}

		for (int i = 0; i < n2; i++) {
			rArr[i] = arr[mid + 1 + i];
		}

		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2) {

			if (lArr[i] <= rArr[j]) {
				arr[k] = lArr[i++];
			} else {
				arr[k] = rArr[j++];
			}
			k++;
		}

		while (i < n1) {
			arr[k] = lArr[i++];
			k++;
		}

		while (j < n2) {
			arr[k] = rArr[j++];
			k++;
		}
	}

	public void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
