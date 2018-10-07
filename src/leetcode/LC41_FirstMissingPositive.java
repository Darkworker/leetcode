package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.LC41_FirstMissingPositive.java create time:2018年10月7日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC41_FirstMissingPositive {
	public static void main(String[] args) {
		int[] nums = new int[] { 3, 4, -1, 1 };
		System.out.println(firstMissingPositive(nums));
	}

	public static int firstMissingPositive(int[] nums) {
		if (nums == null || nums.length == 0)
			return 1;
		int maxPositive = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				if (nums[i] > maxPositive)
					maxPositive = nums[i];
			}
		}
		if (maxPositive == Integer.MIN_VALUE)
			return 1;
		
		byte[] bitmap = new byte[maxPositive + 1];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				bitmap[nums[i]] = 1;
			}
		}
		for (int i = 1; i < bitmap.length; i++) {
			if (bitmap[i] == 0)
				return i;
		}
		return maxPositive + 1;
	}
}
