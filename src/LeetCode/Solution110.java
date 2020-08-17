package LeetCode;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author colorful
 * @date 2020/8/16
 **/
//110. 平衡二叉树
public class Solution110 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        if (Math.abs(height(root.right)-height(root.left))>1) return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    public int height(TreeNode root){
        if (root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

}
