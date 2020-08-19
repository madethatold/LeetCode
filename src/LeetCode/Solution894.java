package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author colorful
 * @date 2020/8/18
 **/
//894. 所有可能的满二叉树
public class Solution894 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> list=new ArrayList<>();
        if (N%2==0){
            return list;
        }
        if (N==1){
            list.add(new TreeNode(0));
            return list;
        }
        for (int i=1;i<N;i+=2){
            List<TreeNode> listLeft=allPossibleFBT(i);
            List<TreeNode> listRight=allPossibleFBT(N-i-1);
            for (TreeNode left:listLeft){
                for (TreeNode right:listRight){
                    TreeNode node=new TreeNode(0);
                    node.left=left;
                    node.right=right;
                    list.add(node);
                }
            }
        }
        return list;
    }


}
