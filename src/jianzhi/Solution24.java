package jianzhi;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针
 * ，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
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
