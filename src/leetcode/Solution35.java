package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : symfony
 * @fileName : leetcode.Solution35.java create time:2018骞�9鏈�15鏃�
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution35 {
	List<String> list=new ArrayList<String>();
	public static void main(String[] args) {
		int[] nums=new int[] {1,3,5,6};
		
		System.out.println(searchInsert(nums,2));
	}
	public static int searchInsert(int[] nums, int target) {
		int begin=0;
		int end=nums.length-1;
		while(begin<end) {
			int mid=(begin+end)/2;
			if(nums[mid]==target) return mid;
			if(nums[mid]>target) {
				end=mid-1;
			}else {
				begin=mid+1;
			}
		}
		return begin;
	}
}
