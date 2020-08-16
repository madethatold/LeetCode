package LeetCode;

/**
 * @author colorful
 * @date 2020/8/16
 **/
//111. 二叉树的最小深度
public class Solution111 {
    public class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public int minDepth(TreeNode root) {
        if (root==null) return 0;
        // null节点不参与比较
        if (root.left == null && root.right != null) {
            return 1 + minDepth(root.right);
        }
        // null节点不参与比较
        if (root.right == null && root.left != null) {
            return 1 + minDepth(root.left);
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}
