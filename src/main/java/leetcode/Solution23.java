package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.Solution23.java create time:2018年9月5日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution23 {
	public static void main(String[] args) {

	}

	public ListNode mergeKLists(ListNode[] lists) {
		if(lists==null||lists.length==0) {
			return null;
		}
		return mergeKLists(lists,0,lists.length-1);
	}

	public ListNode mergeKLists(ListNode[] lists, int begin, int end) {
		if (begin > end)
			return null;
		if (begin == end)
			return lists[begin];
		int mid = (begin + end) / 2;
		ListNode left = mergeKLists(lists, begin, mid);
		ListNode right = mergeKLists(lists, mid + 1, end);
		return merge2(left, right);
	}

	public ListNode merge2(ListNode list1, ListNode list2) {
		ListNode result = new ListNode(2);
		;
		ListNode p = result;
		ListNode cur1 = list1;
		ListNode cur2 = list2;
		while (cur1 != null && cur2 != null) {
			if (cur1.val < cur2.val) {
				p.next = cur1;
				cur1 = cur1.next;
			} else {
				p.next = cur2;
				cur2 = cur2.next;
			}
			p = p.next;
		}
		if (cur1 == null) {
			p.next = cur2;
		}
		if (cur2 == null) {
			p.next = cur1;
		}
		return result.next;
	}
}
