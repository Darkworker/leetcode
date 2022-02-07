package leetcode;

public class LC108_ConvertSortedArraytoBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums==null||nums.length==0) return null;
		return sortedArrayToBST(nums,0,nums.length-1);
	}
	public TreeNode sortedArrayToBST(int[] nums, int beginIdx, int endIdx) {
		if(beginIdx==endIdx) {
			return new TreeNode(nums[beginIdx]);
		}
		if((endIdx-beginIdx)==1) {
			TreeNode p=new TreeNode(nums[endIdx]);
			p.left=sortedArrayToBST(nums,beginIdx,beginIdx);
			return p;
		}
		int mid=(beginIdx+endIdx)/2;
		TreeNode p=new TreeNode(nums[mid]);
		p.left=sortedArrayToBST(nums,beginIdx,mid-1);
		p.right=sortedArrayToBST(nums,mid+1,endIdx);
		return p;
	}
}
