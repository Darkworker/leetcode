package jianzhi;

import java.util.Stack;

/**
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ����������
 * ����4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 * 
 * @author symfony
 *
 */
public class Solution21 {
	public static void main(String[] args) {
		int[] a=new int[]{1,2,3,4,5};
		int[] b=new int[]{4,5,3,2,1};
		System.out.println(new Solution21().IsPopOrder(a, b));
	}
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA == null || pushA.length == 0) {
			return false;
		}
		if (popA == null || popA.length == 0) {
			return false;
		}
		Stack<Integer> stack = new Stack<>();
		int idx1 = 0;
		int idx2 = 0;
		stack.push(pushA[idx1]);
		idx1++;
		while (idx2 < popA.length && idx1 <= pushA.length) {
			if (popA[idx2] == stack.peek()) {
				idx2++;
				stack.pop();
			} else {
				if(idx1==pushA.length) {
					break;
				}
				stack.push(pushA[idx1++]);
			}
		}
		if (idx2 == popA.length) {
			return true;
		}
		return false;
	}
}
