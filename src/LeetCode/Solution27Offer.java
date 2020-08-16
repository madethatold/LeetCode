package LeetCode;

/**
 * @author colorful
 * @date 2020/8/16
 **/
//剑指 Offer 27. 二叉树的镜像
public class Solution27Offer {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root==null) return null;
        TreeNode newNode;
        newNode=mirrorTree(root.left);
        root.left=mirrorTree(root.right);
        root.right=newNode;
        return root;
    }
}
