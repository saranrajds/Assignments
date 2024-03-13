
public class AllOffByOneRecursionAgain {

	public static void main(String[] args) {

		int[] nums1 = {4, 15, 40, 99};
		int[] nums2 = {5, 16, 41, 100};
		System.out.println(isAllOfByOne(nums1, nums2));

	}
	
	private static boolean isAllOfByOne(int[] nums1, int[] nums2) {
		
		if(nums1.length > 0 && nums1.length != nums2.length || nums1[nums1.length-1]+1 != nums2[nums2.length-1])
			return false;		
		
		if( nums1.length == 1 && nums1[nums1.length-1]+1 == nums2[nums2.length-1])
			return true;
		
		nums1 = reduceArray(nums1);
		nums2 = reduceArray(nums2);
		return isAllOfByOne(nums1, nums2);
	}
	
	private static int[] reduceArray(int[] tempArr) {
		
		int[] tempNums = new  int[tempArr.length-1];
		
		for (int i = 0; i < tempArr.length-1; i++) {	
			tempNums[i] = tempArr[i];
		}
		
		return tempNums;		
	}
	
}
