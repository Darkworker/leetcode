package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.LC69_Sqrtx.java create time:2018年10月7日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC69_Sqrtx {
	public static void main(String[] args) {
		LC69_Sqrtx obj=new LC69_Sqrtx();
		System.out.println(obj.mySqrt(4));
	}
	public int mySqrt(int x) {
		long start=0;
		long end=x;
		long target=0;
		while(start<end) {
			long mid=(start+end)/2;
			target=mid*mid;
			if(target==x) {
				return (int)mid;
			}
			if(target>x) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return (int)start-1;
	}
	/*
	 * 傻逼了，应该用二分法的。。。
	 * 谁能想到easy还是有点技巧的
	 */
	// public int mySqrt(int x) {
	// if(x<=0) return 0;
	// if(x<=3) {
	// return 1;
	// }
	// long i=1;
	// for(;i<=x/2;i++) {
	// if(i*i>x) {
	// break;
	// }
	// if(i*i==x) return (int)i;
	// }
	// return (int)i-1;
	// }
}
