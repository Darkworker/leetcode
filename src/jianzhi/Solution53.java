package jianzhi;

import java.util.LinkedList;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution53.java create time:2018年8月5日
 *
 * @describe :
 *
 *           在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 *           例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Solution53 {
	public ListNode deleteDuplication(ListNode pHead) {
		 LinkedList<Integer> queue=new LinkedList<>();
		if(pHead==null) return null;
		ListNode q=pHead;
		boolean flag=true;
		while(q.next!=null) {
			if(q.val==q.next.val) {
				q.next=q.next.next;
				flag=false;
			}else {
				if(flag==false) {
					queue.addLast(-1);
					flag=true;
				}else {
					queue.addLast(1);
				}
				q=q.next;
			}
		}
		ListNode result=new ListNode(-1);
		result.next=pHead;
		ListNode p=result;
		while(!queue.isEmpty()) {
			if(queue.removeFirst()==-1) {
				p.next=p.next.next;
			}else {
				p=p.next;
			}
		}
		return result.next;
	}
}
