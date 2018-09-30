package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.LC19_RemoveNthNodeFromEndofList.java create
 *           time:2018年9月29日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC19_RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(n==0) {
			return head;
		}
		ListNode fast=head;
		ListNode slow=head;
		int tmp=n+1;
		while(tmp>0&&fast.next!=null) {
			fast=fast.next;
			tmp--;
		}
		if(tmp>1) return head;
		if(tmp==1) return head.next;
		while(fast.next!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		if(slow==head) slow.next=slow.next.next;
		return head;
	}
}
