package Assignment_04;

import java.util.Scanner;

public class Program_03 {

	public static void main(String[] args) {
//		 Write a program to find the sum of even numbers only in a given array. Use continue.
		
		Scanner s = new Scanner(System.in);
		System.out.print("Entert the number of value : ");
		
		int n = s.nextInt();
		int[] nums = new int[n];
		System.out.println("Entert the value one by one");
		
		for (int i = 0; i < n; i++) {
			nums[i] = s.nextInt();
		}
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] % 2 == 1) 
				continue;
			System.out.println(nums[i]);
		}
	}

}
