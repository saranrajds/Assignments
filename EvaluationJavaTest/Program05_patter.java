package javaevaluationquestion;

import java.util.Scanner;

public class Program05_patter {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = s.nextInt();
		generatePattern(n);
	}

	public static void generatePattern(int n) {

		int[][] matrix = new int[n][n];
		int left = 0, top = 0, right = n - 1, bottam = n - 1;
		int start = 1, i = 0, j = 0, count = 0, zeroOne = 1;

		while (start <= (n * n)) {
			
			matrix[i][j] = zeroOne;
			start++;
			
			if (i <= bottam && count == 0) {
				if (i == bottam) {
					left++;
					count++;
					j++;
				} else
					i++;
			} else if (j <= right && count == 1) {
				if (j == right) {
					bottam--;
					count++;
					i--;

				} else
					j++;
			} else if (i >= top && count == 2) {
				if (i == top) {
					right--;
					count++;
					j--;

				} else
					i--;
			} else if (j >= left && count == 3) {
				if (j == left) {
					count = 0;
					top++;
					i++;
					zeroOne = 1 - zeroOne;
				} else
					j--;
			}
		}

		displayMatrix(matrix);
	}

	public static void displayMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix.length; j++) {

				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
