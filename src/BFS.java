import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author colorful
 * @date 2020/8/18
 **/
public class BFS {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<TreeNode> Bfs_tree(TreeNode root){
        Queue<TreeNode> myq = new LinkedList<>();
        List<TreeNode> res = new ArrayList<>();
        if(root==null) return null;
        myq.add(root);//添加树的根节点
        while(!myq.isEmpty()){
            int len = myq.size();//当前层的节点个数
            for(int i=0;i<len;i++){
                //将当前层所有的子节点加入队列
                if(myq.peek().left!=null) myq.add(myq.peek().left);
                if(myq.peek().right!=null) myq.add(myq.peek().right);
                //将当前层所有的节点移除队列，并加入List
                res.add(myq.poll());
            }
        }
        return res;
    }

}
