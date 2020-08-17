package LeetCode;

import sun.reflect.generics.tree.Tree;

/**
 * @author colorful
 * @date 2020/8/17
 **/
//701. 二叉搜索树中的插入操作
public class Solution701 {
    public static class TreeNode {
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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null) return new TreeNode(val);
        if (val>root.val) {
            root.right=insertIntoBST(root.right,val);
        }else {
            root.left=insertIntoBST(root.left,val);
        }
        return root;
    }



}
