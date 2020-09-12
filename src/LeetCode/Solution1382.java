package LeetCode;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author colorful
 * @date 2020/8/20
 **/
//1382. 将二叉搜索树变平衡
public class Solution1382 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);//中序遍历，已排序
        return find(list, 0, list.size() - 1);
    }

    public void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        if (root.left != null) preOrder(root.left, list);
        list.add(root.val);
        if (root.right != null) preOrder(root.right, list);
    }

    public TreeNode find(List<Integer> list, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            TreeNode node = new TreeNode(list.get(mid));
            node.left = find(list, left, mid - 1);
            node.right = find(list, mid + 1, right);
            return node;
        }
        return null;
    }


}
