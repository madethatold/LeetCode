package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author colorful
 * @date 2020/8/16
 **/
//589. N叉树的前序遍历
public class Solution589 {

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<Integer> list=new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root==null) return list;
        list.add(root.val);
        for (Node node:root.children){
            preorder(node);
        }
        return list;
    }



}
