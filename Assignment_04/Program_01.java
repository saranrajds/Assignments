package Assignment_04;

import java.util.HashMap;
import java.util.Scanner;

public class Program_01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Entert the number of value : ");
		
		int n = s.nextInt();
		int[] nums = new int[n];
		System.out.println("Entert the value one by one");
		
		for (int i = 0; i < n; i++) {
			nums[i] = s.nextInt();
		}
		
		System.out.print("Enter the seatch value :");		
		int number = s.nextInt();
		
		System.out.println("index : "+getIndex(nums, number));
		s.close();
	}
	
	private static int getIndex(int nums[], int number) {
		
		int index = -1;
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			
			int count = hashmap.get(nums[i]) == null ? 0 : hashmap.get(nums[i]);
			hashmap.put(nums[i], ++count);
			
			if (count >= 2 && nums[i] == number) {
				index = i;
			}
		}
		
		return index;
	}
}


