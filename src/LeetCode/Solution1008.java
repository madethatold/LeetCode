package LeetCode;

/**
 * @author colorful
 * @date 2020/8/19
 **/
//1008. 先序遍历构造二叉树
public class Solution1008 {
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

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for (int i = 0; i < preorder.length; i++) {
            root = add(root, preorder[i]);
        }
        return root;
    }

    public TreeNode add(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = add(root.left, val);
        } else {
            root.right = add(root.right, val);
        }
        return root;
    }

}
