package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution54.java create time:2018年8月5日
 *
 * @describe :
 *
 *           给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class Solution54 {
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if(pNode==null) return null;
		if(pNode.right!=null) {
			return GetLeft(pNode.right);
		}
		if(pNode.next==null) return null;
		if(pNode.next.left==pNode) return pNode.left;
		return pNode.next.next;
	}
	public TreeLinkNode GetParent(TreeLinkNode node) {
		if(node.next==null) return null;
		if(node.next.left==node) return node;
		TreeLinkNode pre=node;
		while(pre!=null) {
			if(pre==pre.next.left) {
				return pre;
			}else {
				pre=pre.next;
			}
		}
		return null;
	}
	public TreeLinkNode GetLeft(TreeLinkNode node) {
		if(node==null) return node;
		while(node.left!=null) {
			node=node.left;
		}
		return node;
	}
}
