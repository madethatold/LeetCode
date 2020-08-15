package LeetCode;

/**
 * @author colorful
 * @date 2020/8/7
 **/
//剑指 Offer 63. 股票的最大利润
public class Solution63Offer {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minBefore=Integer.MAX_VALUE;
        for (int price:prices){
            minBefore=Math.min(minBefore,price);
            profit=Math.max(profit,price-minBefore);
        }
        return profit;
    }
}
