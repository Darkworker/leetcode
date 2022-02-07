package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution38.java create time:2018��8��4��
 *
 * @describe :
 *
 *           ����һ�ö��������жϸö������Ƿ���ƽ���������
 */
public class Solution38 {
	public boolean IsBalanced_Solution(TreeNode root) {
		int change=(TreeDepth(root.left)-TreeDepth(root.right));
		if(change>1||change<-1) {
			return false;
		}else {
			return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
		}
	}
	public int TreeDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		return Math.max(TreeDepth(root.left), TreeDepth(root.right))+1;
	}
}
