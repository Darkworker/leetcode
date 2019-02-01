package leetcode;

public class LC215_KthLargestElementinanArray {
	public static void main(String[] args) {
		int[] nums=new int[] {3,2,3,1,2,4,5,5,6};
		LC215_KthLargestElementinanArray obj=new LC215_KthLargestElementinanArray();
		System.out.println(obj.findKthLargest(nums, 1));
	}
	public int findKthLargest(int[] nums, int k) {
		if(nums==null||nums.length<0) {
			return -1;
		}
		System.out.println(nums.length);
		System.out.println(nums.length-k);
		return findKthHelper(nums,0,nums.length-1,nums.length-k);
	}

	public int findKthHelper(int[] nums, int begin, int end, int k) {
		int pixo = nums[end];
		int i = begin, j = end - 1;
		if(begin==end) {
			return nums[begin];
		}
		while (i < j) {
			while (i < j && nums[i] <= pixo) {
				i++;
			}
			while (i < j && nums[j] >= pixo) {
				j--;
			}
			if(i<j&&nums[i]>pixo) {
				int tmp=nums[i];
				nums[i]=nums[j];
				nums[j]=tmp;
			}
		}
		if(nums[j]<pixo) {
			j=end;
		}
		nums[end]=nums[j];
		nums[j]=pixo;
		if(j==k) {
			return pixo;
		}else if(j<k){
			return findKthHelper(nums,j+1,end,k);
		}else {
			return findKthHelper(nums,begin,j-1,k);
		}
	}
}
