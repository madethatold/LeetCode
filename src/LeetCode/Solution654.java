package LeetCode;

/**
 * @author colorful
 * @date 2020/8/17
 **/
//654. 最大二叉树
public class Solution654 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return find(0,nums.length,nums);
    }
    public TreeNode find(int left,int right,int [] nums){
        if (left==right) return null;
        int max_i=findMax(nums,left,right);
        TreeNode treeNode=new TreeNode(nums[max_i]);
        treeNode.left=find(left,max_i,nums);
        treeNode.right=find(max_i+1,right,nums);
        return treeNode;
    }
    public int findMax(int []nums,int left,int right){
        int max_i=left;
        for (int i=left;i<right;i++){
            if (nums[i]>nums[max_i]){
                max_i=i;
            }
        }
        return max_i;
    }

}
