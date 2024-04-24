package javaevaluationquestion;

public class Program03_GiditsSum {

	public static void main(String[] args) {

		int n1 = 12, n2 = 9;
		int[] arr1 = { 9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6 };
		int[] arr2 = { 7, 8, 4, 6, 2, 1, 9, 9, 7 };

		sum(arr1, arr2);
	}

	private static void sum(int[] arr1, int[] arr2) {

		int n = Math.max(arr1.length-1, arr2.length-1);
		int n1 = arr1.length - 1, n2 = arr2.length - 1;
		int cur = 0;
		int[] result = new int[n + 1];

		while (n1 >= 0 && n2 >= 0) {

			int sum = arr1[n1] + arr2[n2] + cur;

			if (sum > 9) {
				result[n--] = sum % 10;
				cur = 1;
			} else {
				result[n--] = sum;
				cur = 0;
			}

			n1--;
			n2--;
		}

		while (n1 != -1) {
			result[n--] = cur + arr1[n1];
			n1--;
			cur = 0;
		}
		while (n2 != -1) {
			result[n--] = cur + arr1[n2];
			n2--;
			cur = 0;
		}
		if (cur == 1) {
			result[0] = 1;
		}

		displayArray(result);

		int total = 0;
		for (int i = 0; i < result.length; i++) {
			
			if (result[i] != 0) {
				total += result[i];
			}
		}
	}

	private static void displayArray(int[] result) {

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
}
