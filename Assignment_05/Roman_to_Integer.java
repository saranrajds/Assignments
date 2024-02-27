class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> rToNums = new HashMap<Character, Integer>();
        
        rToNums.put('I', 1);
        rToNums.put('V', 5);
        rToNums.put('X', 10);
        rToNums.put('L', 50);
        rToNums.put('C', 100);
        rToNums.put('D', 500);
        rToNums.put('M', 1000);

        int sum = 0, count = s.length()-1, max = 0;
        String temp = s;
        
        while(count >= 0) {
            Character c = s.charAt(count--);
            int nums = rToNums.get(c);

            if(nums >= max) {
                max = nums;
                sum += nums;
            }
            else {
                sum -= nums;
            }
        }

        return sum;

    }
}