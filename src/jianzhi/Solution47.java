package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution47.java create time:2018年8月4日
 *
 * @describe :
 *
 *           将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 *           要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class Solution47 {
	public static void main(String[] args) {
		System.out.println(StrToInt("+1a00"));
	}
	public static int StrToInt(String str) {
		if(str==null||str.length()==0) {
			return 0;
		}
		boolean flag=true;
		int idx=0;
		if(str.charAt(0)=='-') {
			flag=false;
			idx++;
		}else {
			if(str.charAt(0)=='+')
				idx++;
		}
		int res=0;
		int carry=1;
		for(int i=str.length()-1;i>=idx;i--) {
			if(str.charAt(i)>'9'||str.charAt(i)<'0') {
				return 0;
			}
			res+=(str.charAt(i)-'0')*carry;
			carry*=10;
		}
		return flag?res:-res;
	}
}
