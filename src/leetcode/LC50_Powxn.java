package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.LC50_Powxn.java create time:2018年10月7日
 *
 * @describe : 2.00000 -2147483648 ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED
 *           2018
 */
public class LC50_Powxn {
	public static void main(String[] args) {
		LC50_Powxn lc = new LC50_Powxn();
		System.out.println(lc.myPow(2.00000, -2147483648));
	}

	public double myPow(double x, int n) {
		long N = n;
		if (n == 0)
			return 1;
		if (n < 0) {
			// System.out.println(myPowHelper(x, -n));
			double res = 1 / myPowHelper(x, -N);
			if (new Double(res).isInfinite()) {
				return 0.0;
			}
			return res;
		}
		return myPowHelper(x, N);
	}

	// public double myPowHelper(double x, long n) {
	// double result=1;
	// while(n>0) {
	// if((n&1)==1) result*=x;
	// n=n>>1;
	// x*=x;
	// }
	// return result;
	// }
	/*
	 * 采用递归，所以效率有点低
	 */
	// 此时保证n>0
	public double myPowHelper(double x, long n) {
		if (n == 1)
			return x;
		if (n % 2 == 0) {
			double t = myPowHelper(x, n >> 1);
			return t * t;
		} else {
			return myPowHelper(x, n - 1) * x;
		}
	}
	/*
	 * 当n很大时会报栈溢出
	 */
	// public double myPow(double x, int n) {
	// if(n==0) return 1;
	// if(n<0) return -myPowHelper(x, -n);
	// return myPowHelper(x,n);
	// }
	// //此时保证n>0
	// public double myPowHelper(double x,int n) {
	// if(n==1) return x;
	// return x*myPowHelper(x, n-1);
	// }
}
