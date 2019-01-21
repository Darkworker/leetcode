package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC047_PermutationsII {
	public static void main(String[] args) {
		LC047_PermutationsII lc=new LC047_PermutationsII();
		int[] nums=new int[] {1,1,2};
		List<List<Integer>> res=lc.permuteUnique(nums);
		for(List<Integer> line:res) {
			for(int n:line) {
				System.out.print(n+",");
			}
			System.out.println();
		}
	}
	List<List<Integer>> result = new LinkedList<List<Integer>>();

	public List<List<Integer>> permuteUnique(int[] nums) {
		if(nums==null||nums.length==0) {
			return result;
		}
		Arrays.sort(nums);
		List<Integer> rest=new ArrayList<>();
		for(int num:nums) {
			rest.add(num);
		}
		permuteUniqueHelper(rest,new ArrayList<Integer>());
		return result;
	}

	public void permuteUniqueHelper(List<Integer> rest, List<Integer> list) {
		if (rest.size() == 0) {
			result.add(new LinkedList<Integer>(list));
			return;
		}
		for (int i = 0; i < rest.size(); i++) {
			//
			if(i>=1) {
				if(rest.get(i)==rest.get(i-1)) {
					continue; 
				}
			}
			Integer ele = rest.remove(i);
			list.add(ele);
			permuteUniqueHelper(rest, list);
			rest.add(i,ele);
			list.remove(list.size()-1);
		}
	}
}
