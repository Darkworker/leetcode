package leetcode;

public class LC88_MergeSortedArray {
	public static void main(String[] args) {
		int nums1[]=new int[] {0};
		int nums2[]=new int[] {1};
		merge(nums1,0,nums2,1);
		for(int k:nums1) {
			System.out.print(k+" ,");
		}
	}
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null||nums2==null||nums1.length==0||nums2.length==0) return;
		int idx=nums1.length-1;
		int i=m-1;
		int j=n-1;
		while(i>=0&&j>=0) {
			if(nums1[i]>nums2[j]) {
				nums1[idx--]=nums1[i--];
			}else {
				nums1[idx--]=nums2[j--];
			}
		}
		while(j>=0) {
			nums1[idx--]=nums2[j--];
		}
	}
}
