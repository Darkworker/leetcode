package leetcode;

public class LC111_MinimumDepthofBinaryTree {
	public int minDepth(TreeNode root) {
		if(root==null) return 0;
		return treeHeight(root);
	}
	public int treeHeight(TreeNode root) {
		if(root==null) return 0;
		if(root.left==null) {
			return treeHeight(root.right);
		}
		if(root.right==null) {
			return treeHeight(root.left);
		}
		int left=treeHeight(root.left);
		int right=treeHeight(root.right);
		return Math.min(left, right)+1;
	}
}
