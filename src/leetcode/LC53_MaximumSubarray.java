package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.LC53_MaximumSubarray.java create time:2018年10月7日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC53_MaximumSubarray {
	public static void main(String[] args) {
		LC53_MaximumSubarray obj=new LC53_MaximumSubarray();
		System.out.println(obj.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}
	public int maxSubArray(int[] nums) {
		
		int[] tmp = new int[nums.length];
		int[] max = new int[nums.length];
		tmp[0] = nums[0];
		max[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (tmp[i - 1] < 0) {
				tmp[i] = nums[i];
				if (tmp[i] > max[i - 1]) {
					max[i] = tmp[i];
				} else {
					max[i] = max[i - 1];
				}
			} else {
				tmp[i] = tmp[i - 1] + nums[i];
				if (tmp[i] > max[i - 1]) {
					max[i] = tmp[i];
				} else {
					max[i] = max[i - 1];
				}
			}
		}
		return max[nums.length-1];
	}
}
