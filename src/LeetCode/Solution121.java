package LeetCode;

/**
 * @author colorful
 * @date 2020/7/8
 **/
//121. 买卖股票的最佳时机
public class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}
