package LeetCode;

import java.util.List;

/**
 * @author colorful
 * @date 2020/7/28
 **/
//面试题 08.06. 汉诺塔问题
public class Solution08_06 {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        hanoi(A.size(),A,B,C);
    }
    public void hanoi(int n,List<Integer> A, List<Integer> B, List<Integer> C){
        if (n==1) {
            C.add(A.remove(A.size()-1));
            return;
        }
        else {
            hanoi(n-1,A,C,B);
            C.add(A.remove(A.size()-1));
            hanoi(n-1,B,A,C);
        }
    }

}
