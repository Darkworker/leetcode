package leetcode;

public class LC633_SumofSquareNumbers {
	public boolean judgeSquareSum(int c) {
		boolean result=false;
		int i=0;
		int j=new Double(Math.sqrt(c)).intValue();
		while(i<=j) {
			if(i*i+j*j==c) {
				return true;
			}else if(i*i+j*j>c) {
				j--;
			}else {
				i++;
			}
		}
		return result;
	}
}
