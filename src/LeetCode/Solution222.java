package LeetCode;

import sun.awt.geom.AreaOp;

import java.util.function.Predicate;

/**
 * @author colorful
 * @date 2020/8/18
 **/
//222. 完全二叉树的节点个数
public class Solution222 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public int countNodes(TreeNode root) {
        if (root==null) return 0;
        int left=0;
        int right=0;
        if (root.left!=null) left= countNodes(root.left);
        if (root.right!=null) right=countNodes(root.right);
        return left+right+1;
    }

}
