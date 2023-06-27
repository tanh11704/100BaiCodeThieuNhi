package Exercise_109;

public class Solution {
	public static int hammingWeight(int n) {
	    String input = Integer.toBinaryString(n);
	    int count = 0;
	    for (int i = 0; i < input.length(); i++) {
	        if (input.charAt(i) == '1') {
	            count++;
	        }
	    }
	    return count;
	}
	
	public static void main(String[] args) {
		System.out.println(hammingWeight(011011010));
	}
}
