package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : symfony
 * @fileName : leetcode.Solution14.java create time:2018年9月5日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution14 {
	public static void main(String[] args) {

	}

	public String longestCommonPrefix(String[] strs) {
		if(strs==null||strs.length==0) {
			return "";
		}
		if(strs.length==1) {
			return strs[0];
		}
		String common = "";
		List<String> datas = new LinkedList<>();
		for (String s : strs) {
			datas.add(s);
		}
		while(datas.size()>1){
			String str1=datas.remove(0);
			String str2=datas.remove(0);
			String com=longestCommonPrefix(str1,str2);
			if(com=="") {
				return "";
			}
			datas.add(com);
		}
		return datas.get(0);
	}
	public String longestCommonPrefix(String str1,String str2) {
		int begin=0;
		while(begin<str1.length()&&begin<str2.length()&&str1.charAt(begin)==str2.charAt(begin)) {
			begin++;
		}
		if(begin==0) {
			return "";
		}
		return str1.substring(0, begin);
	}
}
