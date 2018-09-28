package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.Solution1.java create time:2018年9月3日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution1 {
	public static void main(String[] args) {
		Solution1 s1=new Solution1();
		int[] nums1=new int[] {2,4};
		int[] nums2=new int[] {1,3,3,5,6,7,8};
		//System.out.println(s1.findInsert(nums1, 0, nums1.length-1, 1));
		System.out.println(s1.findMedianSortedArrays(nums1, nums2));
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len=nums1.length+nums2.length;
		int mid=(len-1)>>1;
		return findMedian(nums1,nums2,0,nums2.length-1,mid);
		
	}
	public int findMedian(int[] nums1, int[] nums2,int begin,int end,int mid) {
		if(begin>=end) {
			return findMedian(nums2,nums1,0,nums1.length-1,mid);
		}
		//找到idx2在num2插入的位置
		int idx2=(begin+end)/2;
		int insert=findInsert(nums1, 0, nums1.length-1, nums2[idx2]);
		int k=insert+idx2;
		if(k<mid) {
			return findMedian(nums1,nums2,mid+1,end,mid);
		}else if(k==mid){
			return nums2[idx2];
		}else {
			return findMedian(nums1,nums2,begin,mid-1,mid);
		}
	}
	public int findInsert(int[] nums1,int begin,int end,int x) {
		if(begin>end) {
			return begin;
		}
		int mid=(begin+end)/2;
		if(nums1[mid]>x) {
			return findInsert(nums1,begin,mid-1,x);
		}else if(nums1[mid]<x){
			return findInsert(nums1,mid+1,end,x);
		}else {
			return mid+1;
		}
	}
}
