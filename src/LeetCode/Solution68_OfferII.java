package LeetCode;

/**
 * @author colorful
 * @date 2020/8/16
 **/
//剑指 Offer 68 - II. 二叉树的最近公共祖先
public class Solution68_OfferII {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null) return null;
        if (p==root||q==root) return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if (left!=null&&right!=null){
            return root;
        }
        if (left==null){
            return right;
        }
        return left;
    }
}
