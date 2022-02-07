package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution30.java create time:2018��8��4��
 *
 * @describe :
 *
 *           ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 *           Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
 *           ���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯, ���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n
 *           ��1���ֵĴ�������
 */
public class Solution30 {
	public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(10));
	}
	public static int NumberOf1Between1AndN_Solution(int n) {
		int count=0;
		for(int i=1;i<=n;i*=10) {
			long driver=i*10;
			count += (n / driver) * i + Math.min(Math.max(n % driver - i + 1, 0), i);
		}
		return count;
	}
}
