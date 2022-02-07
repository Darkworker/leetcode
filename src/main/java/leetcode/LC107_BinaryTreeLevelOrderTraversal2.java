package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LC107_BinaryTreeLevelOrderTraversal2 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new LinkedList<>();
		if(root==null) return result;
		
		List<TreeNode> currentLevel = new LinkedList<>();
		List<TreeNode> nextLevel = new LinkedList<>();
		List<Integer> level = new LinkedList<>();
		
		currentLevel.add(root);
		while(!currentLevel.isEmpty()) {
			TreeNode node=currentLevel.remove(0);
			if(node.left!=null) nextLevel.add(node.left); 
			if(node.right!=null) nextLevel.add(node.right); 
			level.add(node.val);
			if(currentLevel.isEmpty()) {
				result.add(result.size(), level);
				level=new LinkedList<>();
				currentLevel=nextLevel;
				nextLevel=new LinkedList<>();
			}
		}
		return result;
	}
}
