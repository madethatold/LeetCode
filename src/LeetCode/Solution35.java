package LeetCode;

/**
 * @author colorful
 * @date 2020/7/8
 **/
//35. 搜索插入位置
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }
        return nums.length;
    }
}
