package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.Solution11.java create time:2018年9月4日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution11 {
	public static void main(String[] args) {
		System.out.println(new Solution11().maxArea(new int[] {1,2}));
	}
	
	public int maxArea(int[] height) {
		return maxArea(height, 0, height.length - 1);
	}

	public int maxArea(int[] height, int begin, int end) {
		if (begin >= end) {
			return height[begin];
		}
		int area = (end - begin) * Math.min(height[begin], height[end]);
		int min = height[begin] < height[end] ? begin : end;
		if (min == begin) {
			int t = begin;
			boolean flag = false;
			while (t < end) {
				if (height[min] < height[t]) {
					flag = true;
					break;
				}
				t++;
			}
			if (flag) {
				return Math.max(area, maxArea(height, t , end));
			} else {
				return area;
			}
		} else {
			int t = end;
			boolean flag = false;
			while (t > begin) {
				if (height[end] < height[t]) {
					flag = true;
					break;
				}
				t--;
			}
			if (flag) {
				return Math.max(area, maxArea(height, begin, t ));
			} else {
				return area;
			}

		}
	}
}
