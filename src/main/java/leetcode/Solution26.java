package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.Solution26.java create time:2018年9月6日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution26 {
	public static void main(String[] args) {
		int[] nums=new int[] {0,0,1,1,1,2,2,3,3,4};
		int result=0;
		System.out.println(result=removeDuplicates(nums));
		for(int i=0;i<result;i++) {
			System.out.println(nums[i]);
		}
	}
	public  static int removeDuplicates(int[] nums) {
		if(nums==null||nums.length==0) {
			return 0;
		}
		int i=0;
		for(int j=1;j<nums.length;j++) {
			if(nums[i]!=nums[j]) {
				i++;
				nums[i]=nums[j];
			}
		}
		return i+1;
	}
}
