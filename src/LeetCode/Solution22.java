package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author colorful
 * @date 2020/9/20
 **/
public class Solution22 {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        add(list, "",0, 0, n);
        return list;
    }

    public void add(List<String> list,String t, int left, int right, int n) {
        if (left > n || right > n) {
            return;
        }
        if (left==n&&right==n){
            list.add(t);
        }
        if (left>=right){
            String s=new String(t);
            add(list,t+"(",left+1,right,n);
            add(list,s+")",left,right+1,n);
        }
    }

}
