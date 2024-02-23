package Assignment_04;

public class Program_02 {

	public static void main(String[] args) {
//		 Write a program to print prime numbers between 1 to 30
		
		int _start = 1, end = 30;

		for (int i = _start; i <= end; i++) {
			
			int start = 2, no = i / 2;
			boolean flag = true;
			
			while (start <= no) {
				
				if (i % start == 0) {
					flag = false;
					break;
				}
				start++;
			}
			
			if (flag) {
				System.out.print(i+" ");
			}
		}
		
	}
}
