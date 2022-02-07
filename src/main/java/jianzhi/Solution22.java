package jianzhi;

/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
 * 
 * @author symfony
 *
 */
public class Solution22 {
	public static void main(String[] args) {
		int[] arr=new int[] {8,10,8,12};
		System.out.println(new Solution22().VerifySquenceOfBST(arr));
	}
	public boolean VerifySquenceOfBST(int[] sequence) {
		return checkSeq(sequence,0,sequence.length-1);
	}
	public boolean checkSeq(int[] sequence,int begin,int end) {
		if(begin>=end) {
			return true;
		}
		int k=sequence[end];
		boolean flag=false;
		int idx=begin;
		for(int i=begin;i<end;i++) {
			if(sequence[i]>k&&flag==false) {
				flag=true;
				idx=i-1;
			}
			if(flag&&sequence[i]<k) {
				return false;
			}
		}
		return checkSeq(sequence,begin,idx)&&checkSeq(sequence,idx+1,end-1);
	}
}
