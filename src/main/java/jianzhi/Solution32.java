package jianzhi;

import java.util.Stack;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution32.java create time:2018��8��4��
 *
 * @describe :
 *
 *           ��ֻ����������2��3��5��������������Ugly Number���� ����6��8���ǳ�������14���ǣ���Ϊ������������7��
 *           ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
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
