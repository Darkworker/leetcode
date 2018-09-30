package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : symfony
 * @fileName : leetcode.LC_17LetterCombinationsofaPhoneNumber.java create
 *           time:2018年9月29日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC17_LetterCombinationsofaPhoneNumber {
	List<String> result = new LinkedList<String>();

	public static void main(String[] args) {
		LC17_LetterCombinationsofaPhoneNumber obj = new LC17_LetterCombinationsofaPhoneNumber();
		List<String> res = obj.letterCombinations("7");
		for (String s : res) {
			System.out.println(s);
		}

	}

	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0) {
			return result;
		}
		letterCombinations(digits, 0, "");
		return result;
	}

	public void letterCombinations(String digits, int begin, String pre) {
		if (begin == digits.length()) {
			result.add(pre);
			return;
		}
		int num = digits.charAt(begin) - '0';
		char base = (char) ('a' + (num - 2) * 3);
		if (num < 7) {
			for (int i = 0; i < 3; i++) {
				letterCombinations(digits, begin + 1, pre + (char) (base + i));
			}
		} else if (num == 7) {
			base='p';
			for (int i = 0; i < 4; i++) {
				letterCombinations(digits, begin + 1, pre + (char) (base + i));
			}
		} else if (num == 8) {
			base='t';
			for (int i = 0; i < 3; i++) {
				letterCombinations(digits, begin + 1, pre + (char) (base + i));
			}
		} else {
			base='w';
			for (int i = 0; i < 4; i++) {
				letterCombinations(digits, begin + 1, pre + (char) (base + i));
			}
		}
		return;
	}
}
