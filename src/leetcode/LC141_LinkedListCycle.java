package leetcode;

import java.util.HashMap;

public class LC141_LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if(head==null) {
			return false;
		}
		ListNode fast=head;
		ListNode slow=head;
		while(fast.next!=null&&fast.next.next!=null) {
			if(fast==slow||fast.next==slow) {
				return true;
			}
			fast=fast.next.next;
			slow=slow.next;
		}
		return false;
	}
	public boolean hasCycle1(ListNode head) {
		if(head==null) {
			return true;
		}
		HashMap<ListNode,Integer> map=new HashMap<>();
		int tmp=0;
		while(head.next!=null) {
			if(map.containsKey(head)) {
				return true;
			}else {
				map.put(head, tmp);
				tmp++;
			}
		}
		return false;
	}
}
