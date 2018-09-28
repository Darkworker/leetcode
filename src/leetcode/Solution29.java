package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.Solution29.java create time:2018年9月7日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution29 {
	public static void main(String[] args) {
		System.out.println(divide(7, -3));
	}

	public static int divide(int dividend, int divisor) {
		boolean neg = !(dividend > 0 ^ divisor > 0) ? true : false;
		long divid=dividend>0?(long) dividend:-(long) dividend;
		long divis=divisor>0?(long) divisor:-(long) divisor;
		long result = divide(divid, divis);

		if (result > Integer.MAX_VALUE) {
			return neg ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		}
		return neg ? (int) result : -(int) result;
	}

	/**
	 * 
	 * @param dividend
	 *            大于0的long
	 * @param divisor
	 *            大于0的long
	 * @return
	 */
	public static long divide(long dividend, long divisor) {
		if (dividend < 0)
			dividend = -dividend;
		if (divisor < 0)
			divisor = -divisor;
		if (divisor > dividend) {
			return 0;
		}
		long result = 1;
		long div = divisor;
		// 找出最大的pow(divide,x)
		while ((div + div) <= dividend) {
			result += result;
			div += div;
		}

		return result + divide(dividend - div, divisor);
	}
}
