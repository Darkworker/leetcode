package leetcode;

public class LC83_RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null) return null;
		ListNode pre=head;
		while(pre.next!=null) {
			if(pre.val==pre.next.val) {
				pre.next=pre.next.next;
			}else {
				pre=pre.next;
			}
		}
		return head;
	}
}
