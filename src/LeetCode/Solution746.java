package LeetCode;

import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * @author colorful
 * @date 2020/8/11
 **/
//746. 使用最小花费爬楼梯
public class Solution746 {
    public static void main(String[] args) {
        int []ints={1,100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(ints));
    }
    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length<=1||cost==null){
            return 0;
        }
        int []dp=new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for (int i=2;i<dp.length;i++){
            dp[i]=Math.min(dp[i-2]+cost[i],dp[i-1]+cost[i]);
        }
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }
}
