package LeetCode;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author colorful
 * @date 2020/8/11
 **/
//198. 打家劫舍
public class Solution198 {
    public int rob(int[] nums) {
        if (nums.length==0||nums==null){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        int []dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
