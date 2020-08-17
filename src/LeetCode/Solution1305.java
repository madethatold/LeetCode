package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author colorful
 * @date 2020/8/18
 **/
//1305. 两棵二叉搜索树中的所有元素
public class Solution1305 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    List<Integer> list=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        find(root1);
        find(root2);
        Collections.sort(list);
        return list;
    }

    public void find(TreeNode root){
        if (root==null) return;
        list.add(root.val);
        find(root.left);
        find(root.right);
    }
}
