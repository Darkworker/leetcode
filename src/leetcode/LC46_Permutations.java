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
	List<List<Integer>> result=new LinkedList<>();
	List<Integer> datas=new LinkedList<>();
	public List<List<Integer>> permute(int[] nums) {
		for(int n:nums) {
			datas.add(n);
		}
		return result;
	}
	public List<List<Integer>> permute(int[] nums,int begin,List<Integer> data) {
		if(data.size()==nums.length) {
			List<Integer> line=new LinkedList<>();
			for(int d:data) line.add(d);
			result.add(line);
		}
		
	}
	
}
