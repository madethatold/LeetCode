package LeetCode;

import java.util.Arrays;

/**
 * @author colorful
 * @date 2020/9/24
 **/
//287. 寻找重复数
public class Solution287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}
