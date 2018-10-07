package leetcode;

import java.util.Arrays;

/**
 * @author : symfony
 * @fileName : leetcode.LC45_JumpGameII.java create time:2018年10月7日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC45_JumpGameII {
	public static void main(String[] args) {
		LC45_JumpGameII obj = new LC45_JumpGameII();
		System.out.println(obj.jump(new int[] { 1, 3, 43, 23, 232, 23 }));
	}

	public int jump(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 0;
		return jumpHelp(nums);
	}

	// 动态规划
	public int jumpHelp(int[] nums) {
		int min[] = new int[nums.length];
		Arrays.fill(min, 1000000);
		min[nums.length - 1] = 0;
		for (int i = nums.length - 2; i >= 0; i--) {
			min[i] = min(min, nums, i);
		}
		return min[0];
	}

	public int min(int[] min, int[] nums, int begin) {
		if ((begin + nums[begin]) >= nums.length - 1)
			return 1;
		int res = 100000;
		for (int i = begin + 1; i <= begin + nums[begin]; i++) {
			if ((min[i] + 1) < res) {
				res = min[i] + 1;
			}
		}
		return res;
	}
	/*
	 * 递归超时
	 */
	// public int jumpHelp(int[] nums,int begin) {
	// if(nums[begin]+begin>=nums.length-1) {
	// return 1;
	// }
	// int min=100000;
	// for(int i=1;i<=nums[begin];i++) {
	// int step=(jumpHelp(nums,begin+i)+1);
	// if(step<min) {
	// min=step;
	// }
	// }
	// return min;
	// }
}
