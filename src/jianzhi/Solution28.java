package jianzhi;

import java.util.ArrayList;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution28.java create time:2018年8月4日
 *
 * @describe :
 *
 *           输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Solution28 {
	public static void main(String[] args) {
		Solution28 so = new Solution28();
		int[] array=new int[] {4,5,1,6,2,7,3,8};
		so.GetLeastNumbers_Solution(array, 4).stream().forEach((x)->System.out.println(x));;
	}
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> res=new ArrayList<>();
		if(input==null||input.length<=k) {
			return formArrayToList(res, input, 0, input.length-1);
		}
		findK(input,0,input.length-1,k);
		return formArrayToList(res, input, 0, k-1);
	}
	public int findK(int[] array,int begin,int end,int k) {
		int mid = (array.length - 1) >> 1;
		int idx = partition(array, begin, end);
		if (idx < k) {
			return findK(array, idx + 1, end,k);
		}
		if (idx > k) {
			return findK(array, begin, idx - 1,k);
		} else {
			return idx;
		}
	}
	public int partition(int[] array, int begin, int end) {
		int prop = array[end];
		int small = begin - 1;
		int idx = begin;
		for (; idx < end; idx++) {
			if (array[idx] <= prop) {
				small++;
				if (small < idx) {
					swap(array, small, idx);
				}
			}
		}
		swap(array, small + 1, end);
		return small + 1;
	}

	public void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	public ArrayList<Integer> formArrayToList(ArrayList<Integer> res,int[] array,int begin,int end) {
		if(end<=begin) {
			return res;
		}
		for(int i=begin;i<=end;i++) {
			res.add(array[i]);
		}
		return res;
	}
}
