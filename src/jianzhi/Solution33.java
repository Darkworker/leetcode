package jianzhi;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 *  @author   :   symfony
 *  @fileName :   jianzhi.Solution33.java
 *  create time:2018年8月4日
 *
 *  @describe :
 *
 *在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
*/
public class Solution33 {
	public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("google"));
	}
	public static int FirstNotRepeatingChar(String str) {
		if(str==null) {
			return -1;
		}
        ArrayList<Character> que=new ArrayList<>();
        ArrayList<Integer> target=new ArrayList<>();
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<str.length();i++) {
        	Character c=str.charAt(i);
        	if(que.contains(c)) {
        		num.set(que.indexOf(c), num.get(que.indexOf(c))+1);
        	}else {
        		que.add(c);
        		target.add(i);
        		num.add(1);
        	}
        }
        int idx=num.indexOf(1);
        if(idx==-1) {
        	return -1;
        }
        return target.get(idx);
    }
}
