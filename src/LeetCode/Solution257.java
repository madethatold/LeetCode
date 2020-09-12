package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author colorful
 * @date 2020/9/4
 **/
//257. 二叉树的所有路径
public class Solution257 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        String s="";
        dfs(root,s);
        return result;
    }

    public void dfs(TreeNode treeNode, String s) {
        if (treeNode == null) return;
        if (treeNode.left != null) dfs(treeNode.left, s + treeNode.val + "->");
        if (treeNode.right != null) dfs(treeNode.right, s + treeNode.val + "->");
        if (treeNode.left == null && treeNode.right == null) result.add(s+treeNode.val);
    }
}
