package leetcode;

/**
 * 在买卖股票问题中有意思的技巧
 * @author symfony
 *
 */
public class LC121_BestTimetoBuyandSellStock {
	public int maxProfit1(int[] prices) {
		int max = -1;
		// 暴力破解法
		for (int i = 0; i < prices.length - 1; i++) {
			int buy = prices[i];
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] - buy > max) {
					max = prices[j] - buy;
				}
			}
		}
		return max;
	}

	public int maxProfit(int[] prices) {
		int small = Integer.MAX_VALUE;
		int profit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < small) {
				small = prices[i];
			} else if(prices[i]-small>profit){
				profit=prices[i]-small;
			}
		}
		return profit;
	}
}
