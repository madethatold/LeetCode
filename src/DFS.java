import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author colorful
 * @date 2020/8/18
 **/
public class DFS {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<TreeNode> Dfs_tree(TreeNode root) {
        Stack<TreeNode> sta = new Stack<>();
        List<TreeNode> res = new ArrayList<>();
        if (root == null) return null;
        // res.add(root);
        sta.add(root);
        while (!sta.isEmpty()) {
            TreeNode temp = sta.pop();
            res.add(temp);
            if (temp.right != null) sta.push(temp.right);
            if (temp.left != null) sta.push(temp.left);
        }
        return res;

    }
}
