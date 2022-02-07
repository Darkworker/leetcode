package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.LC21_MergeTwoSortedLists.java create time:2018年9月29日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC21_MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null) return l2;
		if(l2==null) return l1;
		ListNode head = new ListNode(0);
		ListNode result = head;
		ListNode p = l1;
		ListNode q = l2;
		while (p != null && q != null) {
			if (p.val < q.val) {
				result.next = p;
				p = p.next;
			} else {
				result.next = q;
				q = q.next;
			}
			result = result.next;
		}
		while (p != null) {
			result.next = p;
			p = p.next;
			result = result.next;
		}
		while (q != null) {
			result.next = q;
			q = q.next;
			result = result.next;
		}
		return head.next;
	}
}
