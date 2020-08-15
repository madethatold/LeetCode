package LeetCode;

import java.util.Arrays;

/**
 * @author colorful
 * @date 2020/8/13
 **/
//16. 最接近的三数之和
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int tempSum=0;
        int result=nums[0]+nums[1]+nums[2];
        for (int i=0;i<nums.length;i++){
            int index1=i+1;
            int index2=nums.length-1;
            while (index1<index2){
                tempSum=nums[i]+nums[index1]+nums[index2];
                if (Math.abs(target-tempSum)<Math.abs(target-result)) result = tempSum;
                if (tempSum<target){
                    index1++;
                }
                if (tempSum>target){
                    index2--;
                }
                if (tempSum==target){
                    return target;
                }
            }
        }
        return result;
    }
}
