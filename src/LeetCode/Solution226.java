package LeetCode;

/**
 * @author colorful
 * @date 2020/9/16
 **/
//226. 翻转二叉树
public class Solution226 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root==null) return null;
        TreeNode newNode;
        newNode=invertTree(root.left);
        root.left=invertTree(root.right);
        root.right=newNode;
        return root;
    }
}
