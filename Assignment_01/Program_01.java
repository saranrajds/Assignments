package Assignment_01;

public class Program_01 {

	public static void main(String[] args) {
//		1. Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short

		float floatValue = 10.00f;
		int intFromFloat = (int)floatValue;
		System.out.println("float => "+floatValue+" int => "+intFromFloat);
		
		double doubleValue = 10.00;
		float floatFromDoubl = (float)doubleValue;
		System.out.println("double => "+ doubleValue+" float => "+floatFromDoubl);
		
		int intValue = 10;
		short shortFromInt = (short)doubleValue;
		System.out.println("int => "+ intValue+" short => "+shortFromInt);
	}

}
