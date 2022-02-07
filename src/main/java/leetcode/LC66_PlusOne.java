package leetcode;

import java.util.Arrays;

public class LC66_PlusOne {
	
	public int[] plusOne(int[] digits) {
		int add=1;
		for(int i=digits.length-1;i>=0;i--) {
			digits[i]+=add;
			if(digits[i]==10) {
				digits[i]=0;
			}else {
				return digits;
			}
		}
		int[] result=new int[digits.length+1];
		Arrays.fill(result, 0);
		result[0]=1;
		return result;
	}
}
