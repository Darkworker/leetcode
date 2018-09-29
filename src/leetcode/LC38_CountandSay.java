package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.LC38_CountandSay.java create time:2018年9月28日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC38_CountandSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(6));
	}
	public static String countAndSay(int n) {
		String pre = "1";
		for (int i = 2; i <= n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < pre.length();) {
				char c = pre.charAt(j);
				int count = 1;
				for (j = j + 1; j < pre.length(); j++) {
					if (pre.charAt(j) != c) {
						break;
					}
					count++;
				}
				sb.append(count);
				sb.append(c);
			}
			pre=sb.toString();
		}
		return pre;
	}
}
