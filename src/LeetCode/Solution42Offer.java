package LeetCode;

/**
 * @author colorful
 * @date 2020/8/7
 **/
//剑指 Offer 42. 连续子数组的最大和
public class Solution42Offer {
    public static void main(String[] args) {
        int []nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int []dp=new int[nums.length];
        int maxSUM=nums[0];
        for (int i=0;i<dp.length;i++){
            dp[i]=0;
        }
        dp[0]=nums[0];
        for (int i=1;i<nums.length;i++){
            if (dp[i-1]>0){
                dp[i]=dp[i-1]+nums[i];
            }else {
                dp[i]=nums[i];
            }
            maxSUM=Math.max(maxSUM,dp[i]);
        }
        return maxSUM;
    }
}
