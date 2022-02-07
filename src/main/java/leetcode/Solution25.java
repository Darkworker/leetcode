package leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author : symfony
 * @fileName : leetcode.Solution25.java create time:2018年9月5日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution25 {
	public static void main(String[] args) {
		
	}
	public ListNode reverseKGroup(ListNode head, int k) {
		Deque<ListNode> stack=new LinkedList<>();
		int num=0;
		ListNode result=new ListNode(1);
		ListNode p=result;
		while(head!=null) {
			stack.addFirst(head);
			num++;
			if(num==k) {
				while(!stack.isEmpty()) {
					p.next=stack.removeFirst();
					p=p.next;
				}
				num=0;
			}
		}
		while(!stack.isEmpty()) {
			p.next=stack.removeLast();
			p=p.next;
		}
		return result.next;
	}
}
