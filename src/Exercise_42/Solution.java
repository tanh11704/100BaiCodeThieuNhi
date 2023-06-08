package Exercise_42;

public class Solution {
	
	public static void moveZeroes(int[] nums) {
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[count] = nums[i];
				count++;
			}
		}
		
		while (count < nums.length) {
			nums[count] = 0;
			count ++;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}
}
