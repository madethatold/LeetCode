package LeetCode;

import com.sun.crypto.provider.PBEWithMD5AndDESCipher;
import com.sun.org.apache.bcel.internal.generic.IFNE;

/**
 * @author colorful
 * @date 2020/9/23
 **/
public class Solution105 {
    public class TreeNode {

        int val;

        TreeNode left;
        TreeNode right;


        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return find(preorder,0,preorder.length,inorder,0,inorder.length);
    }

    public TreeNode find(int[] preorder, int l_p, int r_p, int[] inorder, int l_i, int r_i) {
        if (l_i==r_i) return null;
        int root_val=preorder[l_p];
        TreeNode node = new TreeNode(root_val);
        int index=0;
        for (int i=0;i<inorder.length;i++){
            if (root_val==inorder[i]){
                index=i;
                break;
            }
        }
        node.left= find(preorder,l_p+1,l_p+1+index-l_i,inorder,l_i,index);
        node.right=find(preorder,l_p+1+index-l_i,r_p,inorder,index+1,r_i);
        return node;
    }
}
