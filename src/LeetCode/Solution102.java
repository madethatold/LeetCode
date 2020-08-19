package LeetCode;

import java.util.*;

/**
 * @author colorful
 * @date 2020/8/19
 **/
//102. 二叉树的层序遍历
public class Solution102 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            List<Integer> listTemp=new ArrayList<>();
            int n=queue.size();
            for (int i=0;i<n;i++){
                TreeNode node=queue.poll();
                listTemp.add(node.val);
                if (node.left!=null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
            }
            list.add(listTemp);
        }
        return list;
    }

    public static void main(String[] args) {
        int a=0;
        while (a<5){
            System.out.println(a+" ");
            System.out.println("............");
            a++;
        }
    }
}
