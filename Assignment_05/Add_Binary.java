class Solution {
    public String addBinary(String a, String b) {

        String tempA = a, tempB = b;
		int aLen = a.length()-1, bLen = b.length()-1, rem = 0;
		String sum = "";
		
		if (tempA.length() > 0 && tempB.length() == 0) {
			return a;
		}
		
		if (tempB.length() > 0 && tempA.length() == 0) {
			return b;
		}

        		
		while (aLen >= 0 || bLen >= 0) {
			
			int aRem = 0, bRem = 0;
			
			if(aLen >= 0)
			{
				aRem = tempA.charAt(aLen) - 48;
				tempA = tempA.substring(0, aLen);
			}
			
			if(bLen >= 0)
			{
				bRem = tempB.charAt(bLen) - 48;
				tempB = tempB.substring(0, bLen);
			}
					
            if (aRem == 1 && bRem == 1 && rem == 1) {
				
				rem = 1;
				sum = 1 +""+ sum;
			} 
			else if ((aRem == 1 && bRem == 1) || ((aRem == 1 || bRem == 1) && rem == 1)) {
				
				rem = 1;
				sum = 0 +""+ sum;
			} 
			else if(aRem == 1 || bRem == 1) {
				sum = 1 +""+ sum;
			} 
			else {	
				
				sum = rem +""+ sum;
				rem = 0;
			}
			
			aLen--;
			bLen--;
		}
		
		if (rem == 1) {
			sum = rem +""+ sum;
		}

        return sum;
    }
}