package LeetCode;

import java.util.concurrent.ForkJoinPool;

/**
 * @author colorful
 * @date 2020/9/22
 **/
//238. 除自身以外数组的乘积
public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int len = nums.length;
        int[] output = new int[len];
        for (int i = 0; i < len; i++) {
            output[i] = left;
            left *= nums[i];
        }
        for (int j = len - 1; j >= 0; j--) {
            output[j] *= right;
            right *= nums[j];
        }
        return output;
    }
}
