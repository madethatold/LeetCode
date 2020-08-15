package LeetCode;

/**
 * @author colorful
 * @date 2020/8/11
 **/
//面试题 17.16. 按摩师
public class Solution17_16 {

    public int massage(int[] nums) {
        if (nums==null||nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        int []dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        int re=Math.max(dp[0],dp[1]);
        for (int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
            re=Math.max(re,dp[i]);
        }
        return re;
    }
}
