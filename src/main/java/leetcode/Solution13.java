package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : symfony
 * @fileName : leetcode.Solution13.java create time:2018年9月4日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution13 {
	public static void main(String[] args) {
		System.out.println(new Solution13().romanToInt("III"));
	}
	static int[] base = new int[] { 1000, 500, 100, 50, 10, 5, 1 };
	static String[] rom = new String[] { "M", "D", "C", "L", "X", "V", "I" };
	
	public int romanToInt(String s) {
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<rom.length;i++) {
			map.put(rom[i], base[i]);
		}
		int result=0;
		for(int i=0;i<s.length();i++) {
			if(i!=s.length()-1&&map.get(s.charAt(i)+"")<map.get(s.charAt(i+1)+"")) {
				result+=map.get(s.charAt(i+1)+"")-map.get(s.charAt(i)+"");
				i++;
			}else {
				result+=map.get(s.charAt(i)+"");
			}
		}
		return result;
	}
}
