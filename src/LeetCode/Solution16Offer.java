package LeetCode;

/**
 * @author colorful
 * @date 2020/8/5
 **/
//剑指 Offer 16. 数值的整数次方
public class Solution16Offer {
    public static void main(String[] args) {
        System.out.println(myPow(5, -2));
    }

    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1.0 / x;

        double halfPart=myPow(x,n/2);
        double elsePart=myPow(x,n%2);
        return halfPart*halfPart*elsePart;
    }
}
