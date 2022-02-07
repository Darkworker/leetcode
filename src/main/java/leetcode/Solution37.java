package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.Solution37.java create time:2018年9月15日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution37 {
	static int a=3;
	int b=3;
	public static void main(String[] args) {
		System.out.println(new Solution37().Solution37());
	}
	public int Solution37() {
		int i=0;
		try {
			i++;
			throw new Exception("error");
		}catch(Exception e) {
			return i++;
		}finally {
			i++;
		}
	}
	 class A{
		int k=a;
		int m=b;
	}
}
