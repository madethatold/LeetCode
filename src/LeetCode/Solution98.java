package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author colorful
 * @date 2020/9/27
 **/
//98. 验证二叉搜索树
public class Solution98 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

//    long pre=Long.MIN_VALUE;
//
//    public boolean isValidBST(TreeNode root) {
//        if (root == null) return true;
//        if (!isValidBST(root.left)){
//            return false;
//        }
//        if (root.val<=pre){
//            return false;
//        }
//        pre=root.val;
//        return isValidBST(root.right);
//    }

    List<Integer> list = new ArrayList<>();
    long pre=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        for (int i=0;i<list.size()-2;i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public void order(TreeNode root) {
        if (root == null) {
            return;
        }
        order(root.left);
        list.add(root.val);
        order(root.right);
    }
}
