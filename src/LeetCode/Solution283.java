package LeetCode;

/**
 * @author colorful
 * @date 2020/7/8
 **/
//283. 移动零
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int i, j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }
}
