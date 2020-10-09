package LeetCode;

import java.awt.event.HierarchyBoundsAdapter;

/**
 * @author colorful
 * @date 2020/9/23
 **/
//11. 盛最多水的容器
public class Solution11 {


    public int maxArea(int[] height) {
        if (height.length < 2) return 0;
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            area = Math.max(area, (right - left) * Math.min(height[left], height[right]));
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return area;
    }

}
