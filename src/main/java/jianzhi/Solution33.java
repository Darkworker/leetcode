package jianzhi;

import java.util.ArrayList;

/**
 *  @author   :   symfony
 *  @fileName :   jianzhi.Solution33.java
 *  create time:2018��8��4��
 *
 *  @describe :
 *
 *��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.
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
