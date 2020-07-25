package LeetCode;

/**
 * @author colorful
 * @date 2020/7/8
 **/
//27. 移除元素
public class Solution27 {

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[slow++] = nums[i];
            }
        }
        return slow;
    }
}
