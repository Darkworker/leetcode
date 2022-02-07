package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.Solution28.java create time:2018年9月7日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution28 {
	public static void main(String[] args) {
		System.out.println(strStr("aaab", "ab"));
	}
	public static int strStr(String haystack, String needle) {
		if(needle==null||needle.length()==0) {
			return -1;
		}
		if(haystack==null||haystack.length()==0) {
			return -1;
		}
		return haystack.indexOf(needle);
	}
}
