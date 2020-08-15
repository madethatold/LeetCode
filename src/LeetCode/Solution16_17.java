package LeetCode;

/**
 * @author colorful
 * @date 2020/8/10
 **/
//面试题 16.17. 连续数列
public class Solution16_17 {
    public static void main(String[] args) {
        int []x={-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(x);
    }
    public static int maxSubArray(int[] nums) {
        int []dp=new int[nums.length];
        int max=Integer.MIN_VALUE;
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if (dp[i-1]<0){
                dp[i]=nums[i];
            }else {
                dp[i]=dp[i-1]+nums[i];
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
