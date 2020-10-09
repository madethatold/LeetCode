package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/**
 * @author colorful
 * @date 2020/10/8
 **/
//18. 四数之和
public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length <= 3 || nums == null) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            if (nums[i] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] < target) continue;
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if (nums[i] + nums[j] + nums[nums.length - 1] + nums[nums.length - 2] < target) continue;
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while (left<right&&nums[left]==nums[left+1]){
                            left++;
                        }
                        left++;
                        while (left<right&&nums[right]==nums[right-1]){
                            right--;
                        }
                        right--;
                    }else if(sum<target){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
