package LeetCode;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author colorful
 * @date 2020/8/16
 **/
//590. N叉树的后序遍历
public class Solution590 {
    List<Integer> list=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root== null) return list;
        for (Node node:root.children){
            postorder(node);
        }
        list.add(root.val);
        return list;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
