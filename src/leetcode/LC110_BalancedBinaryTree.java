package leetcode;

public class LC110_BalancedBinaryTree {
	boolean isBalance=true;
	public boolean isBalanced(TreeNode root) {
		treeHeight(root);
		return isBalance;
	}
	public int treeHeight(TreeNode root) {
		if(root==null) return 0;
		int left=treeHeight(root.left);
		int right=treeHeight(root.right);
		if(Math.abs(left-right)>1) {
			isBalance=false;
		}
		return Math.max(left, right)+1;
	}
}
