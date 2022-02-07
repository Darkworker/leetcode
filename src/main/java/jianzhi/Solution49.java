package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution49.java create time:2018��8��5��
 *
 * @describe :
 *
 *           ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
 */
public class Solution49 {
	public int[] multiply(int[] A) {
		int[] left=new int[A.length];
		int[] right=new int[A.length];
		left[0]=1;
		for(int i=1;i<A.length;i++) {
			left[i]=left[i-1]*A[i-1];
		}
		right[0]=1;
		for(int i=1;i<A.length;i++) {
			right[i]=right[i-1]*A[A.length-i];
		}
		int B[]=new int[A.length];
		for(int i=0;i<B.length;i++) {
			B[i]=left[i]*right[right.length-i-1];
		}
		return B;
	}
}
