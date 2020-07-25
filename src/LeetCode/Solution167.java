package LeetCode;

/**
 * @author colorful
 * @date 2020/7/8
 **/
//167. 两数之和 II - 输入有序数组
public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int []result=new int[2];
        int i=0;
        int j=numbers.length-1;
        while(numbers[i]+numbers[j]!=target){
            int temp=numbers[i]+numbers[j];
            if(temp<target){
                i++;
            }
            if(temp>target){
                j--;
            }
        }
        result[0]=i+1;
        result[1]=j+1;
        return result;
    }
}
