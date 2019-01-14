package leetcode;

public class LC125_ValidPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("0p"));
	}

	public static boolean isPalindrome(String s) {
		if (s == null)
			return true;
		int i = 0;
		int j = s.length() - 1;
		s = s.toLowerCase();
		System.out.println(s);
		while (i < j) {
			while (i < j && (!(s.charAt(i) <= 'z' && s.charAt(i) >= 'a')&&!(s.charAt(i) <= '9' && s.charAt(i) >= '0'))) {
				i++;
			}
			while (i < j && (!(s.charAt(j) <= 'z' && s.charAt(j) >= 'a')&&!(s.charAt(j) <= '9' && s.charAt(j) >= '0'))) {
				j--;
			}
			if (i >= j) {
				return true;
			}
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
