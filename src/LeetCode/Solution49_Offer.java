package LeetCode;

/**
 * @author colorful
 * @date 2020/9/10
 **/
//剑指 Offer 49. 丑数
public class Solution49_Offer {
    public int nthUglyNumber(int n) {
        if (n<=0) return -1;
        int []dp=new int[n];
        dp[0]=1;
        int o2=0,o3=0,o5=0;
        for (int i=1;i<n;i++){
            dp[i]=Math.min(Math.min(dp[o2]*2,dp[o3]*3),dp[o5]*5);
            if (dp[i]==dp[o2]*2) o2++;
            if (dp[i]==dp[o3]*3) o3++;
            if (dp[i]==dp[o5]*5) o5++;
        }
        return dp[n-1];
    }
}
