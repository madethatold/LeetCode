package LeetCode;

import javax.swing.plaf.multi.MultiInternalFrameUI;

/**
 * @author colorful
 * @date 2020/7/29
 **/
//面试题 08.05. 递归乘法
public class Solution08_05 {
    public int multiply(int A, int B) {
        if (B == 1) return A;
        return A + multiply(A, B - 1);
    }

}
