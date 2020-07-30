package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author colorful
 * @date 2020/7/30
 **/
//973. 最接近原点的 K 个点
public class Solution973 {
    public static void main(String[] args) {
    }
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]*o1[0]+o1[1]*o1[1]-o2[0]*o2[0]-o2[1]*o2[1];
            }
        });
        int [][]result=new int[K][2];
        for(int i=0;i<K;i++){
            result[i]=points[i];
        }
        return result;
    }
}
