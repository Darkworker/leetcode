package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author : symfony
 * @fileName : leetcode.Solution31.java create time:2018年9月8日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution31 {
	public static void main(String[] args) {
		Solution31 sol = new Solution31();
		int[] nums = new int[] { 5,1,1 };
		sol.nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}

	public void nextPermutation(int[] nums) {
		nextPermutationHelper(nums, nums.length - 2);
	}

	public void nextPermutationHelper(int[] nums, int idx) {
		// 判断idx到nums.length-1有没有下一个组合
		// 如果有返回，如果没有，继续判断idx-1
		// 递归终止条件，idx=-1,这时返回rank
		if (idx == -1) {
			reverse(nums, 0, nums.length-1);
			return;
		}
		if (nums[idx] >= nums[idx + 1]) {
			nextPermutationHelper(nums, idx - 1);
			return;
		}
		// 此时存在下一个排列
		int i = idx + 1;
		while (i < nums.length && nums[i] > nums[idx])
			i++;
		swap(nums, idx, i - 1);
		reverse(nums, idx + 1, nums.length - 1);
		return;
	}

	public void reverse(int nums[], int begin, int end) {
		for (; begin < end; begin++, end--) {
			swap(nums, begin, end);
		}
	}

	public void swap(int nums[], int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
}
