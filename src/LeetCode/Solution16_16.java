package LeetCode;

import java.util.Arrays;

/**
 * @author colorful
 * @date 2020/8/3
 **/
//面试题 16.16. 部分排序
public class Solution16_16 {
    public int[] subSort(int[] array) {
        int[] arrayClone = array.clone();
        Arrays.sort(arrayClone);
        int former = -1, latter = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != arrayClone[i]) {
                if (former == -1) {
                    former = i;
                }
                latter = i;
            }
        }
        return new int[]{former,latter};
    }
}
