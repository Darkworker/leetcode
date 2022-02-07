package jianzhi;

import javax.management.RuntimeErrorException;

/**
 * @author : symfony
 * @fileName : jianzhi.MoreThanHalf.java create time:2018年9月15日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class MoreThanHalf {
	public static void main(String[] args) {
		String str = Integer.toBinaryString(192);
		System.out.println(str);
	}
	public void s() {
		MoreThanHalf.val();
	}
	public static int val() {
		int num=5;
		try {
			num=num/0;
		}catch(Exception e) {
			num=10;
		}finally {
			num=15;
		}
		return num;
	}
	public static int morethanhalf(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new RuntimeErrorException(null, "输入数据非法");
		}
		int x = arr[0];
		int time = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == x) {
				time++;
			} else {
				if(time==1) {
					x=arr[i];
				}else {
					time--;
				}
			}
		}
		return x;
	}
}
