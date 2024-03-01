package Assignment_05;

import java.util.Scanner;

public class Program_02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);		
		System.out.print("Entert the matrix size : ");
		int n = s.nextInt();
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = s.nextInt();
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = i; j < matrix[i].length; j++) {
				
				if(i == j)
					continue;
				
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;				
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
	}
}
