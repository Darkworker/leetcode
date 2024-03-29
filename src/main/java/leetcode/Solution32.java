package leetcode;

import java.util.Stack;

/**
 * @author : symfony
 * @fileName : leetcode.Solution32.java create time:2018年9月8日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution32 {
	public static void main(String[] args) {
		String str = "())()()(())((()(()()(((()))((((())((()(())()())(()((((()))()(()))(())()(())(()(((((())((((((()())())(()(()((())()))(()))))))()(()))((((())()()()))()()()(((()(()())(()()(()(()()(((()))))))()()))())())((()()))))))((()))(((()((())()(()()))((())))()()())))))))()))))(()))))()))()))()((())))((()))(()))))))(((()))))))))()(()()()(())((())()))()()(())))()()))(()())()))(((()())()))((())((((()))(()(()(()()()(((())()(((((()))((()(((((())(()()))((((((((()(()(()(()(())))(())(()())())(()((((()(())((()(())))(())))()(((((()(()()(())))))))())(())(())(()()(((())))((()))(((((()))))())))()((()))()))))())))))((())(((((()()))((((())))(((()(()(())())(((()(()(()()()())))())()))((()((())())()()()(((())(((((()((((((()((()())))((((())((()(((((((()(()((()()()(()(()())(()(()()((((())))()(((()())))(()()))()(()()()()(((((())(()))))((()))())))()((((((()))())))()(()))(())))((((()())(((((()()())(((((())(()())(()))))()(()()))()))))))())))(((())(()(()()))(()))()(((())))())((((()(((()))))))()(()(()))()()(()()))))))))((()))))))(())((()((()))()))((((((()())))))(()((())((((()))))(()(()()()()(()))()()(()(()))(()()(((((((()())(())(()())((())())()(()())((())()())())(()())))())))(())())())(())((()())(((()()))()))()()))()(()(())((((((((())))()((())((()((((((((((()))))(()(((((())(()(()())())))((())())))))()))(()((()()))((()((())()()()((()(())())((())())(()()(((())))))())()()(()))()())(()(()((())))((((()()(())))())(())(()(()(())())())(()()())()(())())))(()()(((())))((()()(((())()()(()())((((()()(()())(()((((()(()()(()(()(((()((()())(()()))(()((((()(((((()))))()()))(((()((((((()(()()()()())()))(()(())))))((()(((()())())))(((()()))(()(()(((((((()()))(()(())))())()(())())(())(()))(())(()))()()(()()())))))()))()((())(((()((((((((())()()))())))((()())(";
		String str1 = ")()())";
		System.out.println(longestValidParenthesesDP(str1));
	}

	public static int longestValidParenthesesDP(String s) {
		if (s == null || s.length() < 3)
			return 0;
		// 动态规划
		int[] dp = new int[s.length()];
		dp[0] = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				dp[i] = 0;
			} else {
				if (s.charAt(i - 1) == '(') {
					dp[i] = (i - 2 >= 0 ? dp[i - 2] + 2 : 2);
				} else {
					dp[i] = (i - 1 - dp[i - 1]) > 0 ? (s.charAt(i - 1 - dp[i - 1]) == '(' ? dp[i - 1] + 2 : 0) : 0;
					if (i - 1 - dp[i - 1] < 0) {
						dp[i] = 0;
					} else {
						// dp[i] = s.charAt(i - 1 - dp[i - 1]) == '(' ? dp[i - 1] + 2 : 0;
						if ((i - dp[i - 1] -1) < 0) {
							dp[i] = 0;
						} else if(s.charAt(i - dp[i - 1] -1)=='('){
							if (i - dp[i - 1] - 2 < 0) {
								dp[i] = dp[i - 1] + 2;
							} else {
								dp[i] = dp[i - 1] + 2 + dp[i - dp[i - 1] - 2];
							}
						}
					}
				}
			}
		}
		// System.out.println(dp[s.length() - 1]);
		int max = 0;
		for (int t : dp) {
			if (t > max)
				max = t;
		}
		return max;

	}

	public static int longestValidParentheses(String s) {
		if (s == null || s.length() < 2) {
			return 0;
		}
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length(); j > i + 1; j--) {
				if (valiate(s.substring(i, j))) {
					if ((j - i) > max) {
						max = j - i;
					}

				}
			}
		}
		return max;
	}

	public static boolean valiate(String s) {
		Stack<Character> stack = new Stack<>();
		stack.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push('(');
			} else {
				if (stack.isEmpty()) {
					stack.push(')');
					break;
				}
				if (stack.peek() == '(') {
					stack.pop();
				} else {
					break;
				}
			}
		}
		return stack.empty();
	}
}
