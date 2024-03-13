
public class GenerateATrainOfCharacters {

	public static void main(String[] args) {
		
		String str = "abcdefg";
		
		if(str.length() % 2 != 1)
			System.out.println("Enter odd number of word");
		else 
		{
			String newStr = generateATrainOfCharacters(str);
			System.out.println(newStr);
		}

	}
	
	private static String generateATrainOfCharacters(String str) {
		
		int middle = (str.length()/2);
		int backword = middle - 1, forword = middle + 1, count = 2;
		String newStr = str.charAt(middle)+"";
		
		for (int i = 0; i < middle; i++) {
			
			for (int j = 0; j < count; j++) {
				
				newStr = str.charAt(backword) + newStr + str.charAt(forword);
			}
			backword--;
			forword++;
			count++;
		}
		
		return newStr;
	}
}
