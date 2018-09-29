package jianzhi;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution32.java create time:2018年8月4日
 *
 * @describe :
 *
 *           把只包含质因子2、3和5的数称作丑数（Ugly Number）。 例如6、8都是丑数，但14不是，因为它包含质因子7。
 *           习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Solution32 {
	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(6));
		
	}
	public static int GetUglyNumber_Solution(int index) {
		Stack<Integer> list=new Stack<>(); 
		list.add(1);
		int m2=0;int m3=0;int m5=0;
		while(list.size()<index) {
			int add=Math.min(2*list.get(m2), Math.min(3*list.get(m3), 5*list.get(m5)));
			list.add(add);
			if(add==2*list.get(m2)) m2++;
			if(add==3*list.get(m3)) m3++;
			if(add==5*list.get(m5)) m5++;
		}
		return list.peek();
	}
}
