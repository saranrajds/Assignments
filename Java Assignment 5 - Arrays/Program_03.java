package Assignment_05;

import java.util.Scanner;

public class Program_03 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter 1st matrix Row : ");
		int _1StRow = s.nextInt();
		
		System.out.print("Enter 1st matrix Cols : ");
		int _1StCols = s.nextInt();
		
		System.out.print("Enter 2nd Matrix value : \n");
		int[][] _1stMatrix = new int[_1StRow][_1StCols];
		
		for (int i = 0; i < _1stMatrix.length; i++) {
			
			for (int j = 0; j < _1stMatrix[i].length; j++) {
				_1stMatrix[i][j] = s.nextInt();
			}
		}	
				
		System.out.print("Enter 2st matrix Row : ");
		int _2ndRow = s.nextInt();
		
		System.out.print("Enter 2st matrix Cols : ");
		int _2ndCols = s.nextInt();
		
		if (_1StRow !=_2ndCols || _1StCols != _2ndRow) {
			System.out.println("Input is in not correct...");
			return;
		}
		
		System.out.print("Enter 2st Matrix value : \n");
		int[][] _2ndMatrix = new int[_2ndRow][_2ndCols];
		
		for (int i = 0; i < _2ndMatrix.length; i++) {
			
			for (int j = 0; j < _2ndMatrix[i].length; j++) {
				_2ndMatrix[i][j] = s.nextInt();
			}
		}
		
		for (int i = 0; i < _1stMatrix.length; i++) {
			
			for (int j = 0; j < _1stMatrix[i].length; j++) {
				System.out.print(_1stMatrix[i][j] + " ");
			}
			System.out.println();
		}
	
		System.out.println();
		
		for (int i = 0; i < _2ndMatrix.length; i++) {
			
			for (int j = 0; j < _2ndMatrix[i].length; j++) {
				System.out.print(_2ndMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int row = _1StRow;
		int cols = _2ndCols;
		
		int[][] multiple = new int[row][cols];
		
		System.out.println(row +" "+cols);
		for (int i = 0; i < _2ndCols; i++) {
			
			for (int j = 0; j < _2ndCols; j++) {
				
				int result = 0;
				for (int j2 = 0; j2 < _1StCols; j2++) {
					result += (_1stMatrix[i][j2]) * _2ndMatrix[j2][j];
				}
				multiple[i][j] = result;
			}
			System.out.println();
		}
		
		for (int i = 0; i < multiple.length; i++) {
			
			for (int j = 0; j < multiple[i].length; j++) {
				System.out.print("multiple "+multiple[i][j] + " ");
			}
			System.out.println();
		}
		s.close();
	}
}
