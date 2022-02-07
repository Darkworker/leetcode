package jianzhi;

import java.util.ArrayList;

/**
 *  @author   :   symfony
 *  @fileName :   jianzhi.Solution40.java
 *  create time:2018��8��4��
 *
 *  @describe :
 *
 *С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
 *���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
 *û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
 *���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
*/
public class Solution40 {
	public static void main(String[] args) {
		Solution40 rr=new Solution40();
		System.out.println(rr.FindContinuousSequence(3).size());
	}
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		ArrayList<Integer> tmp=new ArrayList<>();
		for(int i=1;i<=(sum);i++) {
			for(int j=i+1;j<=(sum);j++) {
				if(sum(i,j)==sum) {
					res.add(get(i,j));
				}else {
					if(sum(i,j)>sum) {
						break;
					}
				}
			}
		}
		return res;
    }
	public ArrayList<Integer> get(int begin,int end){
		ArrayList<Integer> res=new ArrayList<>();
		for(int i=begin;i<=end;i++) {
			res.add(i);
		}
		return res;
	}
	public int sum(int begin,int end) {
		return (begin+end)*(end-begin+1)/2;
	}
}
