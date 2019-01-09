package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LC022_GenerateParentheses {
	public static void main(String[] args) {
		List<String> res=generateParenthesis(0);
		for(String s:res) {
			System.out.println(s);
		}
	}
	public static List<String> generateParenthesis(int n) {
		List<String> res=new LinkedList<>();
		char[] str=new char[n*2];
		generateParenthesis(res,n,n,str);
		return res;
	}

	public static void generateParenthesis(List<String> res,int left, int right, char[] str) {
		if(left==0&&right==0) {
			res.add(String.copyValueOf(str));
			return;
		}
		int pos=str.length-left-right;
		if(left>0) {
			str[pos]='(';
			generateParenthesis(res,left-1,right,str);
		}
		if(right>left) {
			str[pos]=')';
			generateParenthesis(res,left,right-1,str);
		}
	}

}
