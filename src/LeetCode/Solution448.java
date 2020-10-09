package LeetCode;

import java.util.*;

/**
 * @author colorful
 * @date 2020/9/27
 **/
//448. 找到所有数组中消失的数字
public class Solution448 {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> list=new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            nums[Math.abs(nums[i])-1]=-Math.abs(nums[Math.abs(nums[i])-1]);
//        }
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]<0){
//                list.add(i);
//            }
//        }
//        return list;
//    }
    //精妙的方法

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            nums[Math.abs(nums[i])-1]=-Math.abs(nums[Math.abs(nums[i])-1]);
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
}
