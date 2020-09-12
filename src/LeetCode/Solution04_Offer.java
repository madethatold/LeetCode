package LeetCode;

/**
 * @author colorful
 * @date 2020/9/8
 **/
//剑指 Offer 04. 二维数组中的查找
public class Solution04_Offer {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (target == matrix[i][j]) return true;
            if (target > matrix[i][j]) {
                i++;
            } else if (target < matrix[i][j]) {
                j--;
            }
        }
        return false;
    }
}
