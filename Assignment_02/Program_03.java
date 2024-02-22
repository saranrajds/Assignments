package Assignment_02;

import java.util.Scanner;

public class Program_03 {

	public static void main(String[] args) {
//		3. Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.
		
		Scanner s= new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        
        System.out.println("AND => : "+ (num1 & num2));
        System.out.println("OR => : "+ (num1 | num2));
        System.out.println("XOR => : "+ (num1 ^ num2));
        System.out.println("left shift => : "+ (num1 << num2));
        System.out.println("right shift => : "+ (num1 >> num2));
        
        s.close();
//        exmaple num1 = 2, num2 = 3;
//        AND 0010         OR 0010      XOR  0010
//        	  0011            0011           0011
//        	  ----			  ----           ----
//            0010 -> 2       0011 -> 3      0001 -> 1
//        	  ----            ----           ----

	}

}
