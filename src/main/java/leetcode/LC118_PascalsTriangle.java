package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LC118_PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		if(numRows<=0) return result;
		List<Integer> level = new ArrayList<>();
		level.add(1);
		result.add(level);
		int currentLevel = 2;
		while (currentLevel <= numRows) {
			level = new ArrayList<>();
			level.add(1);
			int mid = (currentLevel+1) / 2;
			for (int i = 1; i <= mid; i++) {
				level.add(result.get(currentLevel - 2).get(i - 1)
						+ result.get(currentLevel - 2).get(i));
			}
			int copyIdx=currentLevel%2==0?mid-1:mid-2;
			for(;copyIdx>=0;copyIdx--) {
				level.add(level.get(copyIdx));
			}
			result.add(level);
			currentLevel++;
		}
		return result;
	}
}
