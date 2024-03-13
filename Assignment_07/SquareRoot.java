
public class SquareRoot {

	public static void main(String[] args) {
		
		System.out.println(getSquare(100));
		System.out.println(getSquare(25));
		System.out.println(getSquare(30));
		System.out.println(getSquare(43));
	}

	private static int getSquare(int number) {
		
		int count = 0;
		
		while(count*count < number) {
			
			if(count*count == number) {
				return count;
			}
			count++;
		}
		
		int preSequare = Math.abs(((count-1) * (count-1)) - number);
		int nextSequare = Math.abs(((count) * (count)) - number);
		
		if(preSequare < nextSequare)
			return count-1;
		
		return count;
	}
}
