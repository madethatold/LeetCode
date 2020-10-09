package LeetCode;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author colorful
 * @date 2020/9/28
 **/
//416. 分割等和子集
public class Solution416 {
    public boolean canPartition(int[] nums) {
        
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int a = sc.nextInt();
        while(a != -1){
            list.add(a);
            a = sc.nextInt();
        }
        System.out.println("����������m:");
        int m = sc.nextInt();
        System.out.println("����������n:");
        int n = sc.nextInt();
        int x = n - m;
        int count = 0;
        while(x > 0){
            int flag = list.remove(m - 1);
            list.add(n - 1-count, flag);
            x--;
            count++;
        }
        System.out.println(list);
    }
}
