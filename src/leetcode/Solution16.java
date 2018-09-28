package leetcode;

import java.util.Arrays;

/**
 * @author : symfony
 * @fileName : leetcode.Solution16.java create time:2018年9月5日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution16 {
	public static void main(String[] args) {
		System.out.println(new Solution16().threeSumClosest(new int[] {-1, 2, 1, -4}, 1));
	}
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int min=100000;
		int res=0;
		for(int i=0;i<nums.length-2;i++) {
			for(int j=i+1;j<nums.length-1;j++) {
				for(int k=j+1;k<nums.length;k++) {
					if(Math.abs(nums[i]+nums[k]+nums[j]-target)<min) {
						min=Math.abs(nums[i]+nums[k]+nums[j]-target);
						res=nums[i]+nums[k]+nums[j];
					}else if(nums[j]>0&&(nums[i]+nums[k]+nums[j]-target)>0) {
						break;
					}
				}
			}
		}
		return res;
	}
}
