package LeetCode;

/**
 * @author colorful
 * @date 2020/8/4
 **/
//915. 分割数组
public class Solution915 {
    public int partitionDisjoint(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int left=0;
        int tempMax=A[0];
        int max=A[0];
        for (int i=0;i<A.length;i++){
            max=Math.max(A[i],max);
            if (A[i]<tempMax){
                tempMax=max;
                left=i;
            }
        }
        return left+1;
    }
}
