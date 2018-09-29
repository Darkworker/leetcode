package jianzhi;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution41.java create time:2018年8月4日
 *
 * @describe :
 *
 *           输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
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
