package LeetCode;

/**
 * @author colorful
 * @date 2020/8/16
 **/
//剑指 Offer 55 - I. 二叉树的深度
public class Solution55_1 {
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
