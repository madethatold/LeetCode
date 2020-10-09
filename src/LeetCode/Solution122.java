package LeetCode;

import sun.text.normalizer.UBiDiProps;

/**
 * @author colorful
 * @date 2020/9/21
 **/
//122. 买卖股票的最佳时机 II
public class Solution122 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length==0) return 0;
        int profit=0;
        for (int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    //有问题的思路，但很好
//    public static int maxProfit(int[] prices) {
//        if (prices.length==0) return 0;
//        int min=prices[0];
//        int max=Integer.MIN_VALUE;
//        int indexMin=0;
//        int indexMax=0;
//        int k=0;
//        for (int i=0;i<prices.length;i++){
//            min=Math.min(prices[i],min);
//            if(min==prices[i]){
//                indexMin=i;
//            }
//            max=Math.max(max,prices[i]-min);
//            if (max==prices[i]-min){
//                indexMax=i;
//            }
//        }
//        for (int i=indexMin+1;i<indexMax;i++){
//            if (prices[i]<prices[i-1]){
//                k+=prices[i-1]-prices[i];
//            }
//        }
//        return max+k;
//    }
}
