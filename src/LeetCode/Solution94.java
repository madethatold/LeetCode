package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Adler32;

/**
 * @author colorful
 * @date 2020/8/16
 **/
//94. 二叉树的中序遍历
public class Solution94 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        midOrder(root,list);
        return list;
    }
    public void midOrder(TreeNode root,List<Integer> list){
        if (root!=null) {
            if (root.left!=null){
                midOrder(root.left,list);
            }
            list.add(root.val);
            if (root.right!=null){
                midOrder(root.right,list);
            }
        }

    }

}
