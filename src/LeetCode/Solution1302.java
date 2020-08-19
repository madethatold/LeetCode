package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author colorful
 * @date 2020/8/18
 **/
//1302. 层数最深叶子节点的和
public class Solution1302 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> res = new ArrayList<>();
        if (root == null) return 0;
        int len = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            len = queue.size();
            for (int i = 0; i < len; i++) {
                if (queue.peek().left != null) queue.add(queue.peek().left);
                if (queue.peek().right != null) queue.add(queue.peek().right);
                res.add(queue.poll());
            }
        }
        int sum=0;
        int index=res.size()-1;
        for (int i=0;i<len;i++) sum += res.get(index--).val;
        return sum;
    }

    public int deep(TreeNode root) {
        if (root == null) return 0;
        return Math.max(deepestLeavesSum(root.left), deepestLeavesSum(root.right)) + 1;
    }
}
