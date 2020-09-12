package LeetCode;

import java.util.FormatFlagsConversionMismatchException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author colorful
 * @date 2020/9/10
 **/
//面试题 01.08. 零矩阵
public class Solution01_08 {
    public void setZeroes(int[][] matrix) {
        boolean []ho=new boolean[matrix.length];
        boolean []ve=new boolean[matrix[0].length];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==0){
                   ho[i]=true;
                   ve[j]=true;
                }
            }
        }
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (ho[i]||ve[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }

}
