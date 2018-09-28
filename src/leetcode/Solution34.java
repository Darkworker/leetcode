package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.Solution34.java create time:2018年9月15日
 *
 * @describe :
 * 有序数组中查找某个字符串
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution34 {
	public static void main(String[] args) {
		int[] nums=new int[] {1,2,2,3,4,5};
		searchRange(nums, 6);
	}
	public static int[] searchRange(int[] nums, int target) {
		int begin=0;int end=nums.length-1;
		while(begin<=end) {
			int mid=(begin+end)/2;
			if(nums[mid]<target) {
				begin=mid+1;
			}else {
				end=mid-1;
			}
		}
		int from=begin;
		if(from>=nums.length||from<0||nums[from]!=target) {
			return new int[] {-1,-1};
		}
		begin=0;end=nums.length-1;
		while(begin<=end) {
			int mid=(begin+end)/2;
			if(nums[mid]<=target) {
				begin=mid+1;
			}else {
				end=mid-1;
			}
		}
		int to=end;
		int[] result=new int[] {from,to};
		return result;
	}
}
