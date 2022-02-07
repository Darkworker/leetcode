package leetcode;

import java.util.Stack;

/**
 * @author : symfony
 * @fileName : leetcode.LC20_ValidParentheses.java create time:2018年9月29日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC20_ValidParentheses {
	public static void main(String[] args) {
		LC20_ValidParentheses obj=new LC20_ValidParentheses();
		System.out.println(obj.isValid("()[]{}"));
	}
	
	public boolean isValid(String s) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='('||c=='['||c=='{') {
				stack.push(c);
			}else {
				if(stack.isEmpty()) return false;
				char peek=stack.pop();
				switch(c) {
				case ')': if(peek!='(') {return false;}else break;
				case ']': if(peek!='[') {return false;}else break;
				case '}': if(peek!='{') {return false;}else break;
				}
			}
		}
		return stack.isEmpty();
	}
}
