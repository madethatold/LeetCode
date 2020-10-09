package LeetCode;

/**
 * @author colorful
 * @date 2020/9/27
 **/
//55. 跳跃游戏
public class Solution55 {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if (n<=1) return true;
        boolean []dp=new boolean[n];
        for (int i=n-2;i>=0;i--){
            if (nums[i]>=n-1-i){
                dp[i]=true;
                continue;
            }
            for (int j=i+1;j<n-2;j++){
                if (dp[j]==true&&nums[i]>=j-i){
                    dp[i]=true;
                }
            }
        }
        return dp[0];

    }
}
