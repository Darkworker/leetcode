package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LC119_PascalsTriangleII {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list=new LinkedList<>();
		list.add(1);
		for(int i=1;i<=rowIndex;i++) {
			list.add(1);
			for(int j=i-1;j>=1;j--) {
				list.set(j, list.get(j)+list.get(j-1));
			}
		}
		return list;
	}
}
