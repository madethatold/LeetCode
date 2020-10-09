package LeetCode;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author colorful
 * @date 2020/9/21
 **/
public class Solution101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return is(root,root);
    }

    public boolean is(TreeNode a,TreeNode b){
        if (a==null&&b==null){
            return true;
        }
        if (a==null||b==null){
            return false;
        }
        return a.val==b.val&&is(a.left,b.right)&&is(a.right,b.left);
    }


}
