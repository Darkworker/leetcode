package leetcode;

public class LC680_ValidPalindromeII {
	private static boolean canIgnore = true;

	public static void main(String[] args) {
		System.out.println(validPalindrome("abc"));

	}

	public static boolean validPalindrome(String s) {
		System.out.println(s);
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else if (canIgnore == true) {
				canIgnore = false;
				return validPalindrome(s.substring(i + 1, j + 1)) || validPalindrome(s.substring(i, j));
			} else {
				return false;
			}
		}
		return true;
	}
}
