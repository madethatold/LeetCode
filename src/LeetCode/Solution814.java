package LeetCode;

/**
 * @author colorful
 * @date 2020/8/17
 **/
//814. 二叉树剪枝
public class Solution814 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode pruneTree(TreeNode root) {
        if (root==null) return null;
        root.left=pruneTree(root.left);
        root.right=pruneTree(root.right);
        if (root.right== null && root.left== null && root.val == 0) {
            return null;
        }
        return root;
    }
}
