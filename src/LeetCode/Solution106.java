package LeetCode;

/**
 * @author colorful
 * @date 2020/9/25
 **/
public class Solution106 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return find(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode find(int[] postorder, int l_p, int r_p, int[] inorder, int l_i, int r_i) {
        if (l_i>r_i){
            return null;
        }
        int root_val=postorder[r_p];
        TreeNode root=new TreeNode(root_val);
        int index=0;
        for (int i=l_i;i<inorder.length;i++){
            if (root_val==inorder[i]){
                index=i;
                break;
            }
        }

        root.left=find(postorder,l_p,l_p+index-l_i-1,inorder,l_i,index-1);
        root.right=find(postorder,r_p-r_i+index,r_p-1,inorder,index+1,r_i);
        return root;
    }
}
