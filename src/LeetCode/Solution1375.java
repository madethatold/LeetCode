package LeetCode;

import sun.print.SunMinMaxPage;

/**
 * @author colorful
 * @date 2020/8/2
 **/
//1375. 灯泡开关 III
public class Solution1375 {
    public static void main(String[] args) {
        int []light = {4,1,2,3};
        System.out.println(numTimesAllBlue(light));
    }
    public static int numTimesAllBlue(int[] light) {
        int result=0,is=0;
        for (int i=0;i<light.length;i++){
            is=Math.max(light[i],is);
            if (is==i+1) result++;
        }
        return result;
    }
}
