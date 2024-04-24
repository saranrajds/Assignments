package javaevaluationquestion;

import java.util.Scanner;

public class Program01_patter {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char ch = s.next().charAt(0);
		char c = 'A';
		int n = ch - 64;
		System.out.println(n);
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					System.out.print(c + " ");
				else
					System.out.print("  ");
			}
			c++;
			System.out.println();
		}
		c--;
		for (int i = n - 1; i >= 0; i--) {
			c--;

			for (int j = n - i - 1; j >= 0; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i - 1; j++) {
				if (j == 0 || j == i - 1)
					System.out.print(c + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
}
