package jianzhi;

/**
 * ����������ת˫������
 * 
 * @author symfony
 *
 */
public class Solution25 {
	TreeNode head=null;
	TreeNode pre=null;
	public TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree==null) {
			return null;
		}
		//�������
		Convert(pRootOfTree.left);
		if(head==null) {
			head=pRootOfTree;
			pre=pRootOfTree;
		}else {
			pre.right=pRootOfTree;
			pRootOfTree.left=pre;
			pre=pRootOfTree;
		}
		Convert(pRootOfTree.right);
		return head;
	}
}
