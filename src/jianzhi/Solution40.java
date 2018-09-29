package jianzhi;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  @author   :   symfony
 *  @fileName :   jianzhi.Solution40.java
 *  create time:2018年8月4日
 *
 *  @describe :
 *
 *小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 *但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 *没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 *现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
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
