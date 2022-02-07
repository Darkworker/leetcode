package jianzhi;

/**
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ��
 * ��һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 * 
 * @author symfony
 *
 */
public class Solution24 {
	public static void main(String[] args) {
		RandomListNode root = new RandomListNode(1);
		root.next = new RandomListNode(2);
		System.out.println(root);
		System.out.println(new Solution24().Clone(root));
	}

	public RandomListNode Clone(RandomListNode pHead) {
		if (pHead == null) {
			return null;
		}
		RandomListNode p = pHead;
		RandomListNode copy;
		while (p != null) {
			copy = new RandomListNode(p.label);
			copy.next = p.next;
			copy.random = p.random;
			p.next = copy;
			p = copy.next;
		}
		copy = pHead.next;
		while (copy.next != null) {
			if (copy.random != null)
				copy.random = copy.random.next;
			copy.next = copy.next.next;
			copy = copy.next;
		}
		return pHead.next;
	}
}
