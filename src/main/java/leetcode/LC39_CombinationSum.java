package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : symfony
 * @fileName : leetcode.LC39_CombinationSum.java create time:2018年9月28日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC39_CombinationSum {
	public static void main(String[] args) {
		LC39_CombinationSum obj=new LC39_CombinationSum();
		List<List<Integer>> res=obj.combinationSum(new int[] {2,3,5},8);
		for(List<Integer> s:res) {
			System.out.println(s.toString());
		}
	}
	List<List<Integer>> result = new LinkedList<>();
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		int[] path=new int[candidates.length];
		combinationSum(candidates,path,0,target);
		return result;
	}
	public void combinationSum(int[] candidates, int[] path, int begin, int target) {
		if (target == 0) {
			List<Integer> p=new LinkedList<>();
			for(int i=0;i<begin;i++) {
				for(int j=0;j<path[i];j++) {
					p.add(candidates[i]);
				}
			}
			result.add(p);
			return ;
		}
		if(begin==candidates.length) {
			return;
		}
		for (int i = target / candidates[begin]; i >= 0; i--) {
			path[begin] = i;
			combinationSum(candidates, path, begin + 1, target - candidates[begin] * i);
		}
	}
}
