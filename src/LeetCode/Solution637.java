package LeetCode;

import com.sun.corba.se.impl.oa.poa.POAPolicyMediatorImpl_NR_UDS;

import java.util.*;

/**
 * @author colorful
 * @date 2020/9/12
 **/
//637. 二叉树的层平均值
public class Solution637 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return null;
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            double sum = 0;
            double average;
            for (int i = 0; i < len; i++) {
                if (queue.peek().left != null) queue.add(queue.peek().left);
                if (queue.peek().right != null) queue.add(queue.peek().right);
                sum += queue.poll().val;
            }
            list.add((sum / len));
        }
        return list;
    }

    public static void main(String[] args) {
        double i;
        int k=20;
        int m=9;
        System.out.println((double)(m*1.0/2));
    }
}
