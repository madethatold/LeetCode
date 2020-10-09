package LeetCode;

import sun.text.normalizer.UBiDiProps;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * @author colorful
 * @date 2020/9/24
 **/
//543. 二叉树的直径
public class Solution543 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;
        dfsLen(root);
        return max;
    }

    public int dfsLen(TreeNode root) {
        if (root.left == null && root.right == null) return 0;
        int leftLen=root.left==null?0:dfsLen(root.left)+1;
        int rightLen=root.right==null?0:dfsLen(root.right)+1;
        max=Math.max(max,leftLen+rightLen);
        return Math.max(leftLen,rightLen);
    }

}
