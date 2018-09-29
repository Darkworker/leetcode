package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution50.java create time:2018年8月5日
 *
 * @describe :
 *
 *           求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Solution50 {
	static int res=0;
	public static void main(String[] args) {
		System.out.println(Sum_Solution(3));
	}
	public static int Sum_Solution(int n) {
		boolean ans=(n!=0)&&((res=(Sum_Solution(n-1)+n))!=0);
		return res;
	}
}
