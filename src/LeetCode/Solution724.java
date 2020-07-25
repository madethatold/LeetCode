package LeetCode;

/**
 * @author colorful
 * @date 2020/7/8
 **/
//724. 寻找数组的中心索引
public class Solution724 {
    public int pivotIndex(int[] nums) {

        int sum = 0;
        int sumTemp = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (sum - nums[i] == 2 * sumTemp) {
                return i;
            }
            sumTemp += nums[i];
        }
        return -1;

    }
}
