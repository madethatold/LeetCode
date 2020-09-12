package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author colorful
 * @date 2020/9/11
 **/
//剑指 Offer 56 - I. 数组中数字出现的次数
public class Solution56_I_Offer {
    public int[] singleNumbers(int[] nums) {
        int []result=new int[2];
        int vi=0;
        for (int n:nums){
            vi^=n;
        }
        int vj=vi&(-vi);
        for (int n:nums){
            if ((vj&n)==0){
                result[0]^=n;
            }else {
                result[1]^=n;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int i=Integer.parseInt(Integer.toBinaryString(10));
        System.out.println(~1);
    }
}
