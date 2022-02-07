package jianzhi;

import java.util.Arrays;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution39.java create time:2018��8��4��
 *
 * @describe :
 *
 *           һ�����������������������֮�⣬���������ֶ�������ż���Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 */
public class Solution39 {
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		if(array==null||array.length==0) {
			return ;
		}
		int tmp=Arrays.stream(array).reduce((left,right)->left^right).getAsInt();
		int d=1;
		while((d&tmp)!=d) {
			d=d<<1;
		}
		final int k=d;
		num1[0]=Arrays.stream(array).filter((x)->(x&k)==k).reduce((left,right)->left^right).getAsInt();
		num2[0]=Arrays.stream(array).filter((x)->(x&k)!=k).reduce((left,right)->left^right).getAsInt();
	}
	public static void main(String[] args) {
		int[] num1=new int[1];
		int[] num2=new int[1];
		new Solution39().FindNumsAppearOnce(new int[] {2,4,3,6,3,2,5,5},num1,num2);
	}
	public static int FIndNumsAppear(int[] array) {
		int res=array[0];
		for(int i=1;i<array.length;i++) {
			res=res^array[i];
		}
		return res;
	}
}
