package LeetCode;

/**
 * @author colorful
 * @date 2020/10/8
 **/
//1137. 第 N 个泰波那契数
public class Solution1137 {
    public int tribonacci(int n) {
        if (n<3&&n>0){
            return 1;
        }
        if (n==0){
            return 0;
        }
        if (n<0){
            return 1;
        }
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for (int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}
