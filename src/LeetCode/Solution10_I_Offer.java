package LeetCode;

/**
 * @author colorful
 * @date 2020/7/29
 **/
//剑指 Offer 10- I. 斐波那契数列
public class Solution10_I_Offer {

    public static int fib(int n) {
        if (n<0) return -1;
        if (n==0||n==1) return n;
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<n+1;i++){
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }


}
