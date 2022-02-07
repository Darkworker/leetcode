package jianzhi;

import java.util.Arrays;

/**
 *  @author   :   symfony
 *  @fileName :   jianzhi.Solution31.java
 *  create time:2018��8��4��
 *
 *  @describe :
 *����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 *������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
*/
public class Solution31 {
	public static void main(String[] args) {
		System.out.println(PrintMinNumber(new int[] {}));
	}
	public static String PrintMinNumber(int [] numbers) {
		return Arrays.stream(numbers).mapToObj((x)->x+"")
		.sorted((String o1,String o2)->Integer.parseInt((o1+""+o2))>Integer.parseInt((o2+""+o1))?1:-1)
		.reduce("",(x,y)->x+y);
    }
}
