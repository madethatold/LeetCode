package LeetCode;

/**
 * @author colorful
 * @date 2020/10/7
 **/
//338. 比特位计数
public class Solution338 {
    public int[] countBits(int num) {
        int []res=new int[num+1];
        for (int i=0;i<res.length;i++){
            res[i]=res[i>>1]+(i&1);
        }
        return res;
    }
}
