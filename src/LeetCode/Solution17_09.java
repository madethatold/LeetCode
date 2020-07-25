package LeetCode;

/**
 * @author colorful
 * @date 2020/7/23
 **/
//面试题 17.09. 第 k 个数
public class Solution17_09 {

    public static void main(String[] args) {
        System.out.println(getKthMagicNumber(15));
    }
    public static int getKthMagicNumber(int k) {
        int []result =new int[k];
        int a3=0,a5=0,a7=0;
        result[0]=1;
        for(int i=1;i<k;i++){
            result[i]=Math.min(Math.min(result[a3]*3,result[a5]*5),result[a7]*7);
            if (result[i]==result[a3]*3) a3++;
            if (result[i]==result[a5]*5) a5++;
            if (result[i]==result[a7]*7) a7++;
        }
        for(int p=0;p<k;p++){
            System.out.println(result[p]);
        }
        return result[k-1];
    }
}
