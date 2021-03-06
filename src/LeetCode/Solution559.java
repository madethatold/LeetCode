package LeetCode;

import java.util.List;

/**
 * @author colorful
 * @date 2020/8/16
 **/
//559. N叉树的最大深度
public class Solution559 {
    class Node {
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

    ;

    public int maxDepth(Node root) {
        if (root == null) return 0;
        int max = 0;
        for (Node node : root.children) {
            max = Math.max(max, maxDepth(node)+1) ;
        }
        return max+1;
    }
}
