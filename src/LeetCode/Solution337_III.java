package LeetCode;

/**
 * @author colorful
 * @date 2020/9/16
 **/
//337. 打家劫舍 III
public class Solution337_III {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int rob(TreeNode root) {
        if (root == null) return 0;
        order(root);
        return root.val;
    }

    public void order(TreeNode root) {
        if (root.left != null) {
            order(root.left);
        }
        if (root.right != null) {
            order(root.right);
        }
        int one = 0;
        int two = root.val;
        if (root.left != null){
            one=one+root.left.val;
            if (root.left.left!=null){
                two=two+root.left.left.val;
            }
            if (root.left.right!=null){
                two=two+root.left.right.val;
            }
        }
        if (root.right != null){
            one=one+root.right.val;
            if (root.right.left!=null){
                two=two+root.right.left.val;
            }
            if (root.right.right!=null){
                two=two+root.right.right.val;
            }
        }
        root.val=Math.max(one,two);
    }


}
