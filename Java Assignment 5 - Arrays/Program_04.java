package Assignment_05;

import java.util.Scanner;

public class Program_04 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the spiral : ");
		int n = s.nextInt();
		
		int[][] spiralMatrix = generateSpiral(n);
		
		for (int[] row : spiralMatrix) {
            for (int num : row) {
                System.out.printf(num + " ");
            }
            System.out.println();
        }
		
		s.close();		
	}
	
	public static int[][] generateSpiral(int n) {
		
        int[][] Spiral = new int[n][n];
        
        int nums = 1, left = 0, top = 0, buttom = n - 1, rigth = n-1;
        while (nums <= n*n) {

        	for (int i = left; i <= rigth; i++) {
        		Spiral[top][i] = nums++;
			}
        	top++;
        	
        	for (int i = top; i <= buttom; i++) {
        		Spiral[i][rigth] = nums++;
			}
        	rigth--;
        	
        	for (int i = rigth; i >= left; i--) {
        		Spiral[buttom][i] = nums++;
			}        	
        	buttom--;
        	
	    	for (int i = buttom; i >= top; i--) {
	    		Spiral[i][left] = nums++;
	        }
	    	left++;
		}
	
        return Spiral;
	}
}
