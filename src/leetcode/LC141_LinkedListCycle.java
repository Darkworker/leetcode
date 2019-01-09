package leetcode;

import java.util.HashMap;

public class LC141_LinkedListCycle {
	public boolean hasCycle(ListNode head) {
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
