package leetcode;

/**
 * @author : symfony
 * @fileName : leetcode.LC42_TrappingRainWater.java create time:2018年10月7日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC42_TrappingRainWater {
	public int trap(int[] height) {
		int result=0;
		boolean isRise=false;
		int start=height[0];
		for(int i=1;i<height.length;i++) {
			int begin=height[i-1];
			if(height[i]<begin&&isRise) {
				continue;
			}else if(height[i]<begin&&!isRise) {
				continue;
			}else if(height[i]>begin&&isRise) {
				
			}else if(height[i]>begin&&!isRise) {
				isRise=true;
			}else {
				
			}
		}
		return result;
	}
}
