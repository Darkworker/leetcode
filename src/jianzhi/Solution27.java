package jianzhi;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 
 * @author symfony
 *
 */
public class Solution27 {
	public int MoreThanHalfNum_Solution(int[] array) {
		int mid =finmid(array, 0, array.length - 1);
		int res = array[mid];
		int mid_left = partition(array, 0, mid);
		swap(array, mid, array.length - 1);
		int mid_right = partition(array, mid, array.length - 1);
		int count = (int) Arrays.stream(array).filter((x) -> x == res).count();
		if (count > (array.length - 1) >> 1) {
			return res;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
		Solution27 so = new Solution27();
		System.out.println(so.MoreThanHalfNum_Solution(arr));
	}

	public int finmid(int[] array, int begin, int end) {
		int mid = (array.length - 1) >> 1;
		int idx = partition(array, begin, end);
		if (idx < mid) {
			return finmid(array, idx + 1, end);
		}
		if (idx > mid) {
			return finmid(array, begin, idx - 1);
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
}
