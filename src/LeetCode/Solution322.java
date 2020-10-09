package LeetCode;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

/**
 * @author colorful
 * @date 2020/10/7
 **/
//322. 零钱兑换
public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int []dp=new int[amount+1];
        dp[0]=0;
        for (int i=1;i<dp.length;i++){
            dp[i]=amount+1;
            for (int j=0;j<coins.length;j++){
                if (i-coins[j]<0) continue;
                dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }
}
