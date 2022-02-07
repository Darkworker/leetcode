package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution42.java create time:2018��8��4��
 *
 * @describe :
 *
 *           �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ�����������
 *           ����һ���������ַ�����S���������ѭ������Kλ������������
 *           ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
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
