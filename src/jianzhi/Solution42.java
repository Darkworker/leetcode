package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution42.java create time:2018年8月4日
 *
 * @describe :
 *
 *           汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 *           对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 *           例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class Solution42 {
	public static void main(String[] args) {
		Solution42 so=new Solution42();
		System.out.println(so.LeftRotateString("abcXYZdef", 3));
	}
	public String LeftRotateString(String str, int n) {
		if(str==null||str.length()==0) {
			return str;
		}
		n=n%str.length();
		char[] array=str.toCharArray();
		Rotate(array, 0, str.length()-1);
		Rotate(array, 0, str.length()-n-1);
		Rotate(array, str.length()-n, str.length()-1);
		return new String(array);
	}
	public void Rotate(char[] array,int begin,int end) {
		for(int i=begin,j=end;i<j;i++,j--) {
			char tmp=array[i];
			array[i]=array[j];
			array[j]=tmp;
		}
	}
}
