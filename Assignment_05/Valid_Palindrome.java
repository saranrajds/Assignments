class Solution {
    public boolean isPalindrome(String s) {
        
        if (s.length() <= 1)
            return true;
            
        s = s.replaceAll(" ", "").toLowerCase();
		String newStr = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
				newStr += s.charAt(i);
			}
		} 
        	
		s = newStr;    
        int i = 0 , j = s.length()-1;
        boolean isP = true;
        
        while (i <= j) {
		
        	if (s.charAt(i) != s.charAt(j)) {
        		isP = false;
        		break;
			}
        	i++;
        	j--;
		}    
        
        return isP;
    }
}