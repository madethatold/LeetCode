package LeetCode;

import java.util.Arrays;

/**
 * @author colorful
 * @date 2020/7/8
 **/
//561. 数组拆分 I
public class Solution561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int a=0,b=0,res=0;
        for(int i=0;i<nums.length;i=i+2){
            a=nums[i];
            b=nums[i+1];
            res+=Math.min(a,b);
        }
        return res;
    }
}
