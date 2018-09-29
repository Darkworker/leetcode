package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author : symfony
 * @fileName : leetcode.LC40_CombinationSumII.java create time:2018年9月28日
 *
 * @describe :
 *[14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12]
27
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC40_CombinationSumII {
	List<List<Integer>> result = new LinkedList<>();
	Set<String> set = new HashSet<>();

	public static void main(String[] args) {
		LC40_CombinationSumII obj = new LC40_CombinationSumII();
		List<List<Integer>> res = obj.combinationSum2(new int[] { 14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12 }, 27);
		for (List<Integer> s : res) {
			System.out.println(s.toString());
		}
	}

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		int[] path = new int[candidates.length];
		Arrays.sort(candidates);
		combinationSum2(candidates, path, 0, target);
		return result;
	}

	public void combinationSum2(int[] candidates, int[] path, int begin, int target) {
		if(target<0) return;
		if (target == 0) {
			List<Integer> p = new LinkedList<>();
			for (int i = 0; i < begin; i++) {
				for (int j = 0; j < path[i]; j++) {
					p.add(candidates[i]);
				}
			}
			if (set.contains(p.toString())) {
			} else {
				set.add(p.toString());
				result.add(p);
			}
			return;
		}
		if (begin == candidates.length) {
			return;
		}
		for (int i = 1; i >= 0; i--) {
			path[begin] = i;
			combinationSum2(candidates, path, begin + 1, target - candidates[begin] * i);
		}
	}
}
