package leetcode;

import java.math.BigDecimal;

/**
 * @author : symfony
 * @fileName : leetcode.LC43_MultiplyStrings.java create time:2018年10月7日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC43_MultiplyStrings {
	public static void main(String[] args) {
		System.out.println(multiply("123", "456"));
	}

	public static String multiply(String num1, String num2) {
		return multiply(num1, num2, 0);
	}

	public static String multiply(String num1, String num2, int k1) {
		if (num2 == null || num2.length() == 0)
			return "0";
		BigDecimal n1 = new BigDecimal(num1);
		n1 = n1.multiply(new BigDecimal(num2.charAt(num2.length() - 1) - '0'));
		return add(multiply(num1, num2.substring(0, num2.length() - 1), k1 + 1), n1.toString(), k1);
	}

	public static String add(String num1, String num2, int k) {
		while (k > 0) {
			num2 = num2 + "0";
			k--;
		}
		return add(num1, num2);
	}

	public static String add(String num1, String num2) {
		BigDecimal n1 = new BigDecimal(num1);
		BigDecimal n2 = new BigDecimal(num2);
		return n1.add(n2).toString();
	}
}
