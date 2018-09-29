package jianzhi;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;

/**
 * 输入一颗二叉树的跟节点和一个整数，
 * 打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意:
 * 在返回值的list中，数组长度大的数组靠前)
 * 
 * @author symfony
 *
 */
public class Solution23 {
	public static void main(String[] args) {
		System.out.println("sd");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		ArrayList<ArrayList<Integer>> res = new Solution23().FindPath(root, 3);
		System.out.println(res.size());
	}
	ArrayList<ArrayList<Integer>> result=new ArrayList<>();
	ArrayList<Integer> path=new ArrayList<>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if (root == null) {
			return null;
		}
		path.add(root.val);
		target-=root.val;
		if(target==0&&root.left==null&&root.right==null) {
			result.add(new ArrayList<Integer>(path));
			path.remove(path.size()-1);
			target+=root.val;
			return null;
		}
		FindPath(root.left,target);
		FindPath(root.right,target);
		path.remove(path.size()-1);
		target+=root.val;
		return result;
	}

}
