package Exercise_80;

import java.util.Arrays;

public class Solution {
	public static int maximumProduct(int[] nums) {
		
		Arrays.sort(nums);
		
		return Math.max((nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]), nums[0] * nums[1] * nums[nums.length - 1]);
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(maximumProduct(nums));
	}
}
