
public class CheckingCharacterExistenceRecursion {

	public static void main(String[] args) {
		
//		contains("Hello", 'o') -> true
//		contains("Tharun", 'h') -> true
//		contains("Yellow", 'u') -> false
//		contains("Tower", 'W') -> false
		
		System.out.println(contains("Hello", 'o'));
		System.out.println(contains("Tharun", 'h'));
		System.out.println(contains("Yellow", 'u'));
		System.out.println(contains("Tower", 'W'));
		System.out.println(contains("Hello", 'l'));

	}

	private static boolean contains(String str, char ch) {
		
		if(str.length() == 0)
			return false;
		char c = str.charAt(str.length()-1);
		
		return c == ch || (str.length() > 0 && contains(str.substring(0, str.length()-1), ch));
		
	}
}
