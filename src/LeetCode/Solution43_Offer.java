package LeetCode;

import jdk.nashorn.internal.ir.ReturnNode;

/**
 * @author colorful
 * @date 2020/9/25
 **/
//剑指 Offer 43. 1～n整数中1出现的次数
public class Solution43_Offer {

    public static void main(String[] args) {
        int i=0;
        int k=111;
        while (k>0){
            if (k%10==1){
                i+=1;
            }
            k=k/10;
        }
        System.out.println(i);
    }
    public int countDigitOne(int n) {
        if (n<=0) return 0;
        long []dp=new long[n];
        dp[0]=1;
        for (int i=1;i<n;i++){
            int k=i+1;
            while (k>0){
                if (k%10==1){
                    dp[i]+=1;
                }
                k=k/10;
            }
            dp[i]+=dp[i-1];
        }
        return (int) dp[n-1];
    }
}
