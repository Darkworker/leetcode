package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution47.java create time:2018��8��4��
 *
 * @describe :
 *
 *           ��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�����string����������Ҫ��ʱ����0)��
 *           Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
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
