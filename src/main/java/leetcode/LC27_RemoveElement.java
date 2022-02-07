package leetcode;

public class LC27_RemoveElement {
	public static void main(String[] args) {
		LC27_RemoveElement obj=new LC27_RemoveElement();
		int[] case1=new int[] {0,1,2,2,3,0,4,2};
		System.out.println(obj.removeElement(case1, 2));
	}
	 public int removeElement(int[] nums, int val) {
	        if(nums==null||nums.length==0) return 0;
	        
	        int count = 0;
			for (int i = 0, j = nums.length - 1; i < j;) {
				if(nums[j]==val) {
					j--;
					continue;
				}
				if(nums[i]!=val) {
					i++;
					continue;
				}
				nums[i]=nums[j];
				nums[j]=val;
			}
			for(int j=nums.length-1;j>=0;j--) {
				if(nums[j]==val) {
					count++;
				}else {
					break;
				}
			}
			return nums.length-count;
	    }
}
