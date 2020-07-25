package LeetCode;

/**
 * @author colorful
 * @date 2020/7/8
 **/
//面试题 01.07. 旋转矩阵
public class Solution01_07 {
    public void rotate(int[][] matrix) {
        for (int layer = 0; layer < matrix.length / 2; ++layer) {
            //layer就是层，从外面一层一层往里。
            int first = layer;
            int last = matrix.length - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first;
                int top = matrix[first][i];
                //左到上
                matrix[first][i] = matrix[last - offset][first];
                //下到左
                matrix[last - offset][first] = matrix[last][last - offset];
                //右到下
                matrix[last][last - offset] = matrix[i][last];
                //上到右
                matrix[i][last] = top;
            }
        }
    }
}
