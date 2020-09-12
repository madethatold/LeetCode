package LeetCode;

import java.util.*;

/**
 * @author colorful
 * @date 2020/8/20
 **/
//剑指 Offer 32 - III. 从上到下打印二叉树 III
public class Solution32Offer {
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
        boolean rev=false;
        while (!queue.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int len=queue.size();
            for (int i=0;i<len;i++){
                if (queue.peek().left!=null) queue.add(queue.peek().left);
                if (queue.peek().right!=null) queue.add(queue.peek().right);
                level.add(queue.poll().val);
            }
            if (rev) Collections.reverse(level);
            list.add(level);
            rev=!rev;
        }
        return list;
    }
}
