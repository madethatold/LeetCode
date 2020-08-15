package LeetCode;

import java.util.Arrays;

/**
 * @author colorful
 * @date 2020/8/15
 **/
//923. 三数之和的多种可能
public class Solution923 {
    public static void main(String[] args) {
        int []A={1,1,2,2,3,3,4,4,5,5};
        System.out.println(threeSumMulti(A,8));
    }
    public static int threeSumMulti(int[] A, int target) {
        int mod = (int)Math.pow(10,9) + 7;
        int result=0;
        for (int i=0;i<A.length-2;i++){
            int temp=target-A[i];
            int left=i+1;
            int right=A.length-1;
            while (left<right){
                if (A[left]+A[right]==temp){
                    int rc=1,lc=1;
                    left++;right--;
                    while (left<right&&A[left]==A[left-1]){
                        left++;
                        lc++;
                    }
                    while (left<right&&A[right]==A[right+1]){
                        right--;
                        rc++;
                    }
                    result+=rc*lc;
                }
                if (A[left]+A[right]<temp){
                    left++;
                }
                if (A[left]+A[right]>temp){
                    right--;
                }
            }
        }
        return result;
    }
}
