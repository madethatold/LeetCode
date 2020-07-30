package LeetCode;

/**
 * @author colorful
 * @date 2020/7/29
 **/
//剑指 Offer 10- I. 斐波那契数列
public class Solution10_1 {
    public static void main(String[] args) {
        System.out.println(fib(44));
    }
    public static int fib(int n) {
        return fibs(n);
    }

    public static int fibs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibs(n - 1) + fibs(n - 2);
        }
    }

}
