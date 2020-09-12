package LeetCode;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * @author colorful
 * @date 2020/9/8
 **/
//剑指 Offer 03. 数组中重复的数字
public class Solution03_Offer {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}
