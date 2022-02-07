package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.Solution24.java create time:2018年9月5日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution24 {
	public ListNode swapPairs(ListNode head) {
		if (head.next == null) {
			return head;
		}
		ListNode root = new ListNode(1);
		root.next = head;
		ListNode p = root;
		ListNode q = p.next;
		while (q.next != null) {
			ListNode r=q.next;
			p.next=r;
			q.next=r.next;
			r.next=q;
			p=q;q=p.next;
		}
		return root.next;
	}
}
