package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC47_PermutationsII {
	public static void main(String[] args) {
		LC47_PermutationsII obj=new LC47_PermutationsII();
		List<List<Integer>> res=obj.permuteUnique(new int[] {1,2,1});
		for(List<Integer> line:res) {
			System.out.println(line);
			line.stream().forEach(x->System.out.print(x+" "));
			System.out.println();
		}
	}
	List<List<Integer>> result = new LinkedList<>();

	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
		permuteUniqueHelper(nums,new LinkedList<Integer>());
		return result;
	}

	public void permuteUniqueHelper(int[] nums, List<Integer> array) {
		System.out.println(array.size());
		if (nums.length == array.size()) {
			List<Integer> line=new LinkedList<Integer>();
			for(int n:array) {
				line.add(nums[n]);
			}
			result.add(line);
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (array.contains(i))
				continue;
			if (i == 0) {
				array.add(i);
				permuteUniqueHelper(nums, array);
				array.remove(array.size() - 1);
			} else {
				array.add(i);
				permuteUniqueHelper(nums, array);
				array.remove(array.size() - 1);
			}
		}
	}
}
