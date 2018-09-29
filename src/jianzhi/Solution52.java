package jianzhi;

import java.util.LinkedList;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution52.java create time:2018年8月5日
 *
 * @describe :
 *
 *           给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class Solution52 {
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		if(pHead==null) return null;
		if(pHead.next==null) return null;
		if(pHead.next.next==null) return null;
		ListNode pre=pHead.next.next;
		ListNode follow = pHead.next;
		int step=1;
		while(pre!=follow) {
			step+=1;
			if(pre.next==null) return null;
			pre=pre.next;
			if(pre.next==null) return null;
			pre=pre.next;
			follow=follow.next;
		}
		pre=pre.next;
		follow.next=null;
		ListNode begin=FindFirstCommonNode(pHead,pre);
		return begin;
		
	}
	LinkedList<ListNode> list1=new LinkedList<>();
	LinkedList<ListNode> list2=new LinkedList<>();
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null) {
			return null;
		}
		ListNode res=null;
		while(pHead1!=null) {
			list1.addLast(pHead1);
			pHead1=pHead1.next;
		}
		while(pHead2!=null) {
			list2.addLast(pHead2);
			pHead2=pHead2.next;
		}
		if(list1.getLast()!=list2.getLast()) {
			return null;
		}
		if(list1.getFirst()==list2.getFirst()) {
			return list1.getFirst();
		}
		while(!list1.isEmpty()&&!list2.isEmpty()) {
			res=list1.removeLast();
			list2.removeLast();
            if(list1.isEmpty()||list2.isEmpty()) {
				return res;
			}
			if(list1.getLast()!=list2.getLast()) {
				return res;
			}
		}
		return res;
    }
}
