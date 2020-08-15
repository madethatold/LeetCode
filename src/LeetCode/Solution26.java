package LeetCode;

/**
 * @author colorful
 * @date 2020/8/15
 **/
//26. 删除排序数组中的重复项
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int left=1,right=1;
        for (right=1;right<nums.length;right++){
            if(nums[right]!=nums[right-1]){
                nums[left++]=nums[right];
            }
        }
        return left;
    }
}
