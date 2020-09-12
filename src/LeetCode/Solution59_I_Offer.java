package LeetCode;

import java.lang.reflect.WildcardType;
import java.util.LinkedList;

/**
 * @author colorful
 * @date 2020/9/12
 **/
//剑指 Offer 59 - I. 滑动窗口的最大值
public class Solution59_I_Offer {
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        if (nums.length==0) return new int[0];
//        int []re=new int[nums.length-k+1];
//        for (int i=0;i<nums.length-k+1;i++){
//            int max=Integer.MIN_VALUE;
//            for (int j=i;j<i+k;j++){
//                max=Math.max(nums[j],max);
//            }
//            re[i]=max;
//        }
//        return re;
//    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length==0) return new int[0];
        int []re=new int[nums.length-k+1];
        LinkedList<Integer> queue=new LinkedList<>();
        int index=0;
        for (int i=0;i<nums.length;i++){
            while (!queue.isEmpty()&&nums[queue.peekLast()]<=nums[i]){
                queue.pollLast();//当队列不空，且其中最大值小于新的nums[i]那么弹出最后一个元素
            }
            //没有满足以上while循环的条件即直接入队
            queue.add(i);
            //窗口已经略过最大值，那么最大值就出队
            if (queue.peekFirst()==i-k) queue.pollFirst();
            //已经形成了窗口就可以取max了
            if (i>=(k-1)){
                re[index++]=nums[queue.peekFirst()];
            }
        }
        return re;
    }
}
