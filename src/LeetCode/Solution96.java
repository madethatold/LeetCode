package LeetCode;

/**
 * @author colorful
 * @date 2020/8/20
 **/
//96. 不同的二叉搜索树
public class Solution96 {
    public static void main(String[] args) {
        System.out.println(numTrees(3));
    }

    public static int numTrees(int n) {
        if (n <= 1) return 1;
        int count = 0;
        for (int i = 0; i <= n - 1; i++) {
            count += numTrees(i) * numTrees(n - i - 1);
        }
        return count;
    }
}
