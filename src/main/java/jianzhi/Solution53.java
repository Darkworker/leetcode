package jianzhi;

import java.util.LinkedList;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution53.java create time:2018��8��5��
 *
 * @describe :
 *
 *           ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣
 *           ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
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
