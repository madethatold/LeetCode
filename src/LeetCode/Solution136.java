package LeetCode;

/**
 * @author colorful
 * @date 2020/7/11
 **/
public class Solution136 {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        return result;
    }
}
