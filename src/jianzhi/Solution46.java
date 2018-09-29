package jianzhi;
/**
 *  @author   :   symfony
 *  @fileName :   jianzhi.Solution46.java
 *  create time:2018年8月4日
 *
 *  @describe :
 *
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号
*/
public class Solution46 {
	public static void main(String[] args) {
		Solution46 so=new Solution46();
		System.out.println(so.Add(20, 54));
	}
	public int Add(int num1, int num2) {
		int carry=(num1&num2)<<1;
		int res=num1^num2;
		while(carry!=0) {
			int tmp=(res&carry)<<1;
			res=res^carry;
			carry=tmp;
		}
		return res;
	}
}
