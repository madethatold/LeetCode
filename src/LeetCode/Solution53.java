package LeetCode;

/**
 * @author colorful
 * @date 2020/7/11
 **/
//53. 最大子序和
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            if (sum > max) {
                max = sum;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
