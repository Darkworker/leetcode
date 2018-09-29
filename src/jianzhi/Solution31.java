package jianzhi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 *  @author   :   symfony
 *  @fileName :   jianzhi.Solution31.java
 *  create time:2018年8月4日
 *
 *  @describe :
 *输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
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
