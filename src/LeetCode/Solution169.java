package LeetCode;

import java.util.Arrays;

/**
 * @author colorful
 * @date 2020/7/11
 **/
//169. 多数元素
public class Solution169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if(nums.length>0){
            return nums[nums.length/2];
        }
        return -1;
    }
}
