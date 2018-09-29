package jianzhi;

import java.util.LinkedList;

/**
 *  @author   :   symfony
 *  @fileName :   jianzhi.Solution35.java
 *  create time:2018年8月4日
 *
 *  @describe :
 *
 *  输入两个链表，找出它们的第一个公共结点。
*/
public class Solution35 {
	public static void main(String[] args) {
		Solution35 res=new Solution35();
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode pHead1=node1;
		pHead1.next=node3;
		ListNode pHead2=node2;
		pHead2.next=node3;
		res.FindFirstCommonNode(pHead1, pHead2);
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
