package Combined_Assignment_1;

public class ScopeOfVariables {

	
	public static void main(String[] args) {
		
		int globalVar = 10;
		
		if(globalVar == 10)
		{
			int localVar = 20;
			System.out.println("Inside Block");
			System.out.println("Global Var "+globalVar);
			System.out.println("Local Var "+localVar);
		}
		
		System.out.println("\nInside Block");
		System.out.println("Global Var "+globalVar);
//		System.out.println("Local Var "+localVar);
		
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			localVar cannot be resolved to a variable
	}

}
