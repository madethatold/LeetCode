package LeetCode;

/**
 * @author colorful
 * @date 2020/10/5
 **/
//581. 最短无序连续子数组
public class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length <= 1) return 0;
        int left = nums.length - 1;
        int right = 0;
        int max = nums[0];
        int min = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[nums.length - i - 1]);
            if (nums[i] < max) {
                right = i;
            }
            if (nums[nums.length - 1 - i] > min) {
                left = nums.length - i - 1;
            }
        }
        return right > left ? right - left + 1 : 0;
    }
}
