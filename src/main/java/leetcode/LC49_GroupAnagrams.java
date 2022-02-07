package leetcode;

import java.util.*;

/**
 * @author : symfony
 * @fileName : leetcode.LC49_GroupAnagrams.java create time:2018年10月7日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC49_GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new LinkedList<>();
		Map<String, List> map = new HashMap<>();
		for (String str : strs) {
			String s=sort(str);
			if(!map.containsKey(s)) {
				List<String> line=new LinkedList<>();
				line.add(str);
				map.put(s, line);
				result.add(line);
			}else {
				map.get(s).add(str);
			}
		}
		return result;
	}

	public String sort(String str) {
		char[] res = str.toCharArray();
		Arrays.sort(res);
		return new String(res);
	}
}
