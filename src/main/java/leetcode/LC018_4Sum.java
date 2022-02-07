package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 利用两数求和，获得任意多数求和
 * 
 * @author symfony
 *
 */
public class LC018_4Sum {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		return nSum(nums,target,4,0);
	}

	public List<List<Integer>> nSum(int[] nums, int target, int n, int index) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		if (index >= nums.length) {
			return res;
		}
		if (n == 2) {
			int i = index;
			int j = nums.length - 1;
			while (i < j) {
				if (nums[i] + nums[j] == target) {
					List<Integer> tmp = new LinkedList<>();
					tmp.add(nums[i]);
					tmp.add(nums[j]);
					res.add(tmp);
					while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
						i++;
					}
					while (j - 1 >= 0 && nums[j] == nums[j - 1]) {
						j--;
					}
					i++;
					j--;
				} else if (nums[i] + nums[j] > target) {
					j--;
				} else {
					i++;
				}
			}
		} else {
			for (int i = index; i < nums.length - n + 1; i++) {
				List<List<Integer>> tmp = nSum(nums, target - nums[i], n - 1, i + 1);
				for (List<Integer> t : tmp) {
					t.add(0, nums[i]);
				}
				res.addAll(tmp);
				while (i + 1 < nums.length && nums[i + 1] == nums[i]) {
					i++;
				}
			}
		}
		return res;
	}

}
