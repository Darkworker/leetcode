package jianzhi;

import java.util.Arrays;
import java.util.function.IntConsumer;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution29.java create time:2018年8月4日
 *
 * @describe :
 *
 *           HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,
 *           当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},
 *           连续子向量的最大和为8(从第0个开始,到第3个为止)。给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class Solution29 {
	public static void main(String[] args) {
		Solution29 so = new Solution29();
		System.out.println(so.FindGreatestSumOfSubArray(new int[] {6,-3,-2,7,-15,1,2,2}));
	}
	public int FindGreatestSumOfSubArray(int[] array) {
		if(array==null||array.length==0) {
			return 0;
		}
		int max=Integer.MIN_VALUE;
		int tmp=0;
		for(int i=0;i<array.length;i++) {
			tmp+=array[i];
			if(tmp<0) {
				tmp=0;
			}else if(tmp>max) {
				max=tmp;
			}
		}
		return max;
	}
}
