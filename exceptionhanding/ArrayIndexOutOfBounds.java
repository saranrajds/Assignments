package exceptionhanding;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {

		displayArray();
	}

	private static void displayArray() {
	
		try {
			
			int[] arr = {1, 3};			
			arr[2] = 10;
		}
		catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}				
	}
}
