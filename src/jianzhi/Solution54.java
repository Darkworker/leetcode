package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution54.java create time:2018��8��5��
 *
 * @describe :
 *
 *           ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
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
