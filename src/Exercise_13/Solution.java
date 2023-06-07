package Exercise_13;

import java.util.Iterator;

public class Solution {
	public static void reverseString(char[] s) {
		String arr_s = String.copyValueOf(s);
		String result = new StringBuilder(arr_s).reverse().toString();
		char[] arr_result = result.toCharArray();
		for (int i = 0; i < arr_result.length; i++) {
			if (i == 0) {
				System.out.print("[\"");
				System.out.print(arr_result[i] + "\",\"");
			} else if (i == arr_result.length - 1) {
				System.out.print(arr_result[i] + "\"]");
			} else {
				System.out.print(arr_result[i] + "\",\"");
			}
		}
	}
	public static void main(String[] args) {
		char[] s = {'H','a','n','n','a','h'};
		reverseString(s);
	}
}
