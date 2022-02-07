package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution50.java create time:2018��8��5��
 *
 * @describe :
 *
 *           ��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
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
