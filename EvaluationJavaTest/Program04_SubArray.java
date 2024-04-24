package javaevaluationquestion;

import java.util.ArrayList;
import java.util.Collections;

public class Program04_SubArray {

	public static void main(String[] args) {

		int n = 8;
		int[] arr = { 2, 7, 5, -1, -3, 2, 9, 7 };
		int[] arr2 = { 3, -1, 6, 1, -5, 1, 3, -8 };
		
		getSubArray(arr);
	}

	private static void getSubArray(int[] arr) {

		int sum = 0, max = Integer.MIN_VALUE, index = -1;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] < 0) {
				
				if (max < sum ) {
					index = i-1;
					 max = sum;
					 sum = 0;
				}
			}
			else {
				sum += arr[i];
			}
						
		}
		if (max < sum ) {
			 max = sum;
			 sum = 0;
			 index = arr.length-1;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = index; i >= 0; i--) {
			if(arr[i] < 0)
				break;
			list.add(arr[i]);
		}
		
		Collections.sort(list);
		System.out.print(list);
		System.out.println("\nMax sum : "+ max);
	}
}
