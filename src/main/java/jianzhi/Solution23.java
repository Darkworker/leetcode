package jianzhi;

import java.util.ArrayList;

/**
 * ����һ�Ŷ������ĸ��ڵ��һ��������
 * ��ӡ���������н��ֵ�ĺ�Ϊ��������������·����·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����(ע��:
 * �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
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
