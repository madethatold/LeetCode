package LeetCode;

/**
 * @author colorful
 * @date 2020/7/22
 **/
//1124. 表现良好的最长时间段
public class Solution1124 {
    public int longestWPI(int[] hours) {
        int maxLen = 0;
        if(hours.length==0||hours==null){
            return 0;
        }
        for (int k = 0; k < hours.length; k++) {
            hours[k] = hours[k] > 8 ? 1 : -1;
        }
        for (int i = 0; i < hours.length; i++) {
            int sum = 0;
            for (int j = i ; j < hours.length; j++) {
                sum = sum + hours[j];
                if(sum>0){
                    if(j-i+1>maxLen){
                        maxLen=j-i+1;
                    }
                }
            }
        }
        return maxLen;
    }
}
