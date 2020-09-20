package LeetCode;

/**
 * @author colorful
 * @date 2020/9/16
 **/
//剑指 Offer 64. 求1+2+…+n
public class Solution64_Offer {
    public int sumNums(int n) {
        int re = n;
        boolean flag = n > 0 && (re += sumNums(n - 1))>0;
        return re;
    }
}
