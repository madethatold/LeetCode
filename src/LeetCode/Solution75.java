package LeetCode;

import java.util.Arrays;

/**
 * @author colorful
 * @date 2020/8/15
 **/
//75. 颜色分类
public class Solution75 {
    public static void main(String[] args) {
        int []nums={0,1,2,1,1,1,0,1,0,2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int []temp= Arrays.copyOf(nums,nums.length);
        for (int i=0;i<temp.length;i++){
            if (temp[i]==0){
                nums[left++]=0;
            }
            if (temp[i]==2){
                nums[right--]=2;
            }
        }
        for (int i=left;i<=right;i++){
            nums[i]=1;
        }
    }
}
