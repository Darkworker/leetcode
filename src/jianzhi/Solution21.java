package jianzhi;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列
 * ，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
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
