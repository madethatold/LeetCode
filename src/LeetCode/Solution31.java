package LeetCode;

import java.util.Arrays;

/**
 * @author colorful
 * @date 2020/8/3
 **/
//31. 下一个排列
public class Solution31 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 23, 4, 11, 44};


    }

    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                int j = nums.length - 1;
                for (; j >= i && nums[j] <= nums[i - 1]; j--) ;
                swap(nums,i-1,j);
                reverse(nums,i,nums.length-1);
                return;
            }
        }
        reverse(nums,0,nums.length-1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }


}
