package LeetCode;

/**
 * @author colorful
 * @date 2020/7/11
 **/
public class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int count = 0;
        int temp;
        for(int k=0;k<nums.length;k++){
            sum=sum+nums[k];
        }
        if(sum<s){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            sum = i;
            temp = 1;
            for (int j = i + 1; j < nums.length && sum<s; j++) {
                sum = sum + nums[j];
                temp++;
            }
            if(i==0){
                count=temp;
            }else {
                if(temp<count){
                    count=temp;
                }
            }
        }
        return count;
    }
}
