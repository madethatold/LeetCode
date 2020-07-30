package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author colorful
 * @date 2020/7/28
 **/
//面试题 16.11. 跳水板
public class Solution16_11 {
    public static void main(String[] args) {

    }

    public int[] divingBoard(int shorter, int longer, int k) {
        if (k==0) return new int[]{};
        if(shorter==longer){
            return new int[]{k*shorter};
        }
        else {
            int temp=k*shorter;
            int result[]=new int[k+1];
            for (int i=0;i<=k;i++){
                result[i]=temp+(longer-shorter)*i;
            }
            return result;
        }
    }
}
