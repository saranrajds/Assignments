package sudoko;

public class Sudoko {

	private static final int GRIDSIZE = 9;

	public static void main(String[] args) {

		int[][] board = { { 7, 0, 2, 0, 5, 0, 6, 0, 0 }, { 0, 0, 0, 0, 0, 3, 0, 0, 0 }, { 1, 0, 0, 0, 0, 9, 5, 0, 0 },

				{ 8, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 4, 3, 0, 0, 0, 0, 9, 0 }, { 0, 9, 0, 0, 0, 0, 7, 5, 0 },

				{ 0, 0, 0, 7, 0, 0, 0, 0, 5 }, { 0, 0, 0, 2, 0, 0, 0, 0, 0 }, { 0, 0, 7, 0, 4, 0, 2, 0, 3 }, };

		if (solveBoard(board)) {
			System.out.println("Success");
		} else {
			System.out.println("Not Success");
		}

		displayBoard(board);
	}

	private static void displayBoard(int[][] board) {

		for (int i = 0; i < GRIDSIZE; i++) {
			for (int j = 0; j < GRIDSIZE; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static boolean isNumberInRow(int[][] board, int number, int row) {

		for (int i = 0; i < GRIDSIZE; i++) {
			for (int j = 0; j < GRIDSIZE; j++) {
				if (board[row][j] == number) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean isNumberInCols(int[][] board, int number, int col) {

		for (int i = 0; i < GRIDSIZE; i++) {
			for (int j = 0; j < GRIDSIZE; j++) {
				if (board[i][col] == number) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean isNumberInBox(int[][] board, int number, int row, int cols) {

		int boxRow = row - row % 3;
		int boxCol = cols - cols % 3;
		
//		System.out.println(boxRow + " "+ boxCol);
		for (int i = boxRow; i < boxRow + 3; i++) {
			for (int j = boxCol; j < boxCol + 3; j++) {
				if (board[i][j] == number) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean isValidPlace(int[][] board, int number, int row, int cols) {

		return !isNumberInRow(board, number, row) 
				&& !isNumberInCols(board, number, cols)
				&& !isNumberInBox(board, number, row, cols);
	}

	private static boolean solveBoard(int[][] board) {

		for (int row = 0; row < GRIDSIZE; row++) {
			for (int column = 0; column < GRIDSIZE; column++) {
				if (board[row][column] == 0) {
					for (int numberToTry = 1; numberToTry <= GRIDSIZE; numberToTry++) {
						if (isValidPlace(board, numberToTry, row, column)) {
							board[row][column] = numberToTry;

							if (solveBoard(board)) {
								return true;
							} else {
								board[row][column] = 0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}
}
