package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.Solution33.java create time:2018年9月15日
 *
 * @describe : 反转数组中搜索 ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution33 {
	public static void main(String[] args) {
		int[] nums = new int[] {4,5,6,7,0,1,2};
		System.out.println(search(nums,10));
	}

	public static int search(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1;
		return searchHelp(nums, 0, nums.length - 1, target);
	}

	public static int searchHelp(int[] nums, int begin, int end, int target) {
		if (begin > end)
			return -1;
		int mid = (begin + end) / 2;
		if (nums[mid] == target)
			return mid;
		if (nums[begin] < nums[end]) {
			// 这时是有序数组的二分查找
			if (nums[mid] < target) {
				return searchHelp(nums, mid + 1, end, target);
			} else {
				return searchHelp(nums, begin, mid - 1, target);
			}
		} else {
			// 这是需要往两个方向比较
			return Math.max(searchHelp(nums, begin, mid - 1, target), searchHelp(nums, mid + 1, end, target));
		}
	}
}
