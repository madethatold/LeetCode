/**
 * @author colorful
 * @date 2020/8/7
 **/
//三角形问题
public class SolutionTriangle {

    private static int[][] triangle = {
            {2, 0, 0, 0},
            {3, 4, 0, 0},
            {6, 5, 7, 0},
            {4, 1, 8, 3}
    };

    public static int traverseRecursion(int i, int j) {
        //以递归方式求解
        int totalRow = 4; // 总行数
        if (i >= totalRow - 1) {
            return 0;
        }
        // 往左下节点走时
        int leftSum = traverseRecursion(i + 1, j) + triangle[i + 1][j];
        // 往右下节点走时
        int rightSum = traverseRecursion(i + 1, j + 1) + triangle[i + 1][j + 1];
        // 记录每个节点往左和往右遍历的路径和的最小值
        return Math.min(leftSum, rightSum);
    }

    public static int traverseDP() {
        int ROW = 4;
        //记录每一行的每个元素的最优解
        int[] mini = triangle[ROW - 1];
        // 从倒数第二行求起，因为最后一行的值本身是固定的
        for (int i = ROW - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[j].length; j++) {
                mini[j] = triangle[i][j] + Math.min(mini[j], mini[j+1]);
            }
        }
        return mini[0];
    }


    public static void main(String[] args) {

    }

}
