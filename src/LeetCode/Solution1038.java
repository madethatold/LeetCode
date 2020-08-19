package LeetCode;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLBoundFault;

import java.util.ArrayList;
import java.util.List;

/**
 * @author colorful
 * @date 2020/8/19
 **/
//1038. 从二叉搜索树到更大和树
public class Solution1038 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    private int pre = 0;
    public TreeNode bstToGst(TreeNode root) {
        if (root==null) return root;
        bstToGst(root.right);
        pre+=root.val;
        root.val=pre;
        bstToGst(root.left);
        return root;
    }




}
