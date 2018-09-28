package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author : symfony
 * @fileName : leetcode.Solution15.java create time:2018年9月5日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution15 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> nn = new LinkedHashMap<>();
		LinkedList<Integer> list = new LinkedList<>();
		nn.get(1);
		System.out.println(nn.get(1));
	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new LinkedList<>();
		Arrays.sort(nums);
		HashMap<Integer, Integer> negOne = new HashMap<>();
		HashMap<Integer, Integer> posOne = new HashMap<>();
		HashMap<String, Integer> resultOne = new HashMap<>();
		int zero = 0;
		for (int num : nums) {
			if (num == 0) {
				zero++;
			} else if (num < 0) {
				negOne.put(num, 1);
			} else {
				posOne.put(num, 1);
			}
		}
		for (int i = 0; i < nums.length - 1 && nums[i] < 0; i++) {
			for (int j = i + 1; j < nums.length && nums[j] < 0; j++) {
				if (posOne.containsKey(0 - nums[i] - nums[j])) {
					if (resultOne.containsKey(nums[i] + "," + nums[j] + "," + (0 - nums[i] - nums[j]))) {
						continue;
					} else {
						LinkedList<Integer> res = new LinkedList<>();
						res.add(nums[i]);
						res.add(nums[j]);
						res.add(0 - nums[i] - nums[j]);
						result.add(res);
						resultOne.put(nums[i] + "," + nums[j] + "," + (0 - nums[i] - nums[j]), 1);
					}

				}
			}
		}
		for (int i = nums.length - 1; i > 0 && nums[i] > 0; i--) {
			for (int j = i - 1; j >= 0 && nums[j] > 0; j--) {
				if (negOne.containsKey(0 - nums[i] - nums[j])) {
					if (resultOne.containsKey(nums[i] + "," + nums[j] + "," + (0 - nums[i] - nums[j]))) {
						continue;
					} else {
						LinkedList<Integer> res = new LinkedList<>();
						res.add(nums[i]);
						res.add(nums[j]);
						res.add(0 - nums[i] - nums[j]);
						result.add(res);
						resultOne.put(nums[i] + "," + nums[j] + "," + (0 - nums[i] - nums[j]), 1);
					}

				}
			}
		}
		if (zero == 0) {
			return result;
		}
		if (zero >= 3) {
			LinkedList<Integer> res = new LinkedList<>();
			res.add(0);
			res.add(0);
			res.add(0);
			result.add(res);
		}
		for (int num : negOne.keySet()) {
			if (posOne.containsKey(0 - num)) {
				LinkedList<Integer> res = new LinkedList<>();
				res.add(0);
				res.add(num);
				res.add(0 - num);
				result.add(res);
			}
		}
		return result;
	}
}
