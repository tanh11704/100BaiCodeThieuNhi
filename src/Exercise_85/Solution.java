package Exercise_85;

public class Solution {
	public static String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
	
	public static void main(String[] args) {
		System.out.println(convertToBase7(100));
	}
}
