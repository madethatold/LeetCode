package LeetCode;

import com.sun.corba.se.impl.protocol.giopmsgheaders.ReplyMessage_1_0;

import java.io.PushbackInputStream;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author colorful
 * @date 2020/8/19
 **/
//1110. 删点成林
public class Solution1110 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        Set<Integer> toDelete=new HashSet<>();
        int []a={1,2,3,4,5};
        toDelete= Arrays.stream(a).boxed().collect(Collectors.toSet());
        System.out.println(toDelete);
    }

    Set<Integer> toDelete=new HashSet<>();
    List<TreeNode> list=new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if (root == null) return Collections.emptyList();
        for (int i:to_delete){
            toDelete.add(i);
        }
        root=order(root);
        if (root!=null) list.add(root);
        return list;
    }
    public TreeNode order(TreeNode root){
        if (root==null) return root;
        root.left=order(root.left);
        root.right=order(root.right);
        if (toDelete.contains(root.val)){
            if (root.left!=null) list.add(root.left);
            if (root.right!=null) list.add(root.right);
            return null;
        }
        return root;
    }

}
