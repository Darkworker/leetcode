package leetcode;
//2019.2.8
//和她聊到了催婚，聊到了爱情，聊到了未来，聊到了过年是下馆子还是自己做
//
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
