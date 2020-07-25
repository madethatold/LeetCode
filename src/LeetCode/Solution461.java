package LeetCode;

/**
 * @author colorful
 * @date 2020/7/11
 **/
//461. 汉明距离
public class Solution461 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;//异或，得到一个数字，其二进制是异或得到的结果
        int sum = 0;//z中1的个数
        while (z > 0) {
            sum += z & 1;//最后一位与运算，得到1则最后一位是1
            z = z >> 1;//二进制数整体向后移一位，高位补0
        }
        return sum;
    }
}
