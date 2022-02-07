package jianzhi;

import java.util.ArrayList;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution41.java create time:2018��8��4��
 *
 * @describe :
 *
 *           ����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 */
public class Solution41 {
	public static void main(String[] args) {
		Solution41 so=new Solution41();
		int[] array=new int[] {1,2,3,4,5,6,7,8};
		System.out.println(so.FindNumbersWithSum(array, 4));
	
	}
	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> res=new ArrayList<>();
		for(int i=0,j=array.length-1;i<j;) {
			if((array[i]+array[j])==sum) {
				res.add(array[i]*array[j]);
				j--;
			}else if((array[i]+array[j])>sum) {
				j--;
			}else {
				i++;
			}
		}
		if(res.isEmpty()) {
			return res;
		}
		int small=Integer.MAX_VALUE;
		for(int d:res) {
			if(d<small) {
				small=d;
			}
		}
		System.out.println(small);
		res.clear();
		res.add(small);
		return res;
	}
}
