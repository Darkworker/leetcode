package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : symfony
 * @fileName : leetcode.Solution12.java create time:2018年9月4日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
/**
 * 
 * I 1 V 5 X 10 L 50 C 100 D 500 M 1000
 * 
 * @author symfony
 *
 */
public class Solution12 {
	public static void main(String[] args) {
		System.out.println(new Solution12().intToRoman(1994));
	}

	static int[] base = new int[] { 1000, 500, 100, 50, 10, 5, 1 };
	static String[] rom = new String[] { "M", "D", "C", "L", "X", "V", "I" };
	List<Integer> result = new LinkedList<>();

	public String intToRoman(int num) {
		intToRomanHelper(num);
		StringBuilder sb = new StringBuilder();
		for (Integer d : result) {
			sb.append(rom[d]);
		}
		return sb.toString();
	}

	public void intToRomanHelper(int num) {
		if (num == 0) {
			return;
		}
		int j = 1;
		while (num / j != 0) {
			j *= 10;
		}
		j = j / 10;
		int n = num / j * j;
		num = num % j;
		bre:
		while (n != 0) {
			for (int i = 0; i < base.length; i++) {
				if (base[i] == n + 1) {
					result.add(6);
					result.add(i);
					break bre;
				}
				if (base[i] == n + 100) {
					result.add(2);
					result.add(i);
					break bre;
				}
				if (base[i] == n + 10) {
					result.add(4);
					result.add(i);
					break bre;
				}
				if (base[i] <= n) {
					n -= base[i];
					result.add(i);
					break;
				}
			}
		}
		intToRomanHelper(num);
	}
}
