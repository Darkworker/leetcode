package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution30.java create time:2018年8月4日
 *
 * @describe :
 *
 *           求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 *           为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 *           但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化, 可以很快的求出任意非负整数区间中1出现的次数（从1 到 n
 *           中1出现的次数）。
 */
public class Solution30 {
	public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(10));
	}
	public static int NumberOf1Between1AndN_Solution(int n) {
		int count=0;
		for(int i=1;i<=n;i*=10) {
			long driver=i*10;
			count += (n / driver) * i + Math.min(Math.max(n % driver - i + 1, 0), i);
		}
		return count;
	}
}
