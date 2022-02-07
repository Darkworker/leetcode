package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.Solution27.java create time:2018年9月6日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution27 {
	public static void main(String[] args) {
		int nums[]=new int[] {0,1,2,2,3,0,4,2};
		int res=removeElement(nums,2);
		System.out.println("res:"+res);
		res=nums.length-res;
		for(int i=0;i<res;i++) {
			System.out.println(nums[i]);
		}
	}
	public static int removeElement(int[] nums, int val) {
		int result=0;
		int i=0;int j=0;
		while(i<nums.length&&j<nums.length) {
			while(i<nums.length&&nums[i]!=val) i++;
			i=j++;
			while(j<nums.length&&nums[j]==val) j++;
			if(i<nums.length&&j<nums.length) {
				nums[i]=nums[j];nums[j]=val;
				result++;
				i++;
			}
		}
		return result;
	}
}
