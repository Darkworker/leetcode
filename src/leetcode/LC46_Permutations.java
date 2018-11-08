package leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

/**
 * @author : symfony
 * @fileName : leetcode.LC46_Permutations.java create time:2018年10月7日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC46_Permutations {
	public static void main(String[] args) {
		LC46_Permutations obj=new LC46_Permutations();
		obj.permute(new int[] {1,2,3});
	}
	List<List<Integer>> result=new LinkedList<>();
	public List<List<Integer>> permute(int[] nums) {
		permute(nums,new LinkedList<Integer>());
		return result;
	}
	public void permute(int[] nums,List<Integer> data) {
		if(data.size()==nums.length) {
			result.add(new LinkedList<>(data));
            return ;
		}
		for(int i=0;i<nums.length;i++) {
			if(data.contains(nums[i])) continue;
			data.add(nums[i]);
			permute(nums,data);
			data.remove(data.size()-1);
		}
		return;
	}
	
}
