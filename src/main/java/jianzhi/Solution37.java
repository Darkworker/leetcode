package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution37.java create time:2018��8��4��
 *
 * @describe : ����һ�ö����������������ȡ� �Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 *
 */
public class Solution37 {
	
	public int TreeDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		return Math.max(TreeDepth(root.left), TreeDepth(root.right))+1;
	}
}
