package LeetCode;

import javax.swing.*;
import java.lang.reflect.WildcardType;

/**
 * @author colorful
 * @date 2020/9/11
 **/
//2. 两数相加
public class Solution2 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode re=new ListNode(0);
        ListNode node=re;
        int carry=0;
        while (l1!=null||l2!=null||carry!=0){
            int val1=l1!=null?l1.val:0;
            int val2=l2!=null?l2.val:0;
            int sum=val1+val2+carry;
            carry=sum/10;
            ListNode newNode=new ListNode(sum%10);
            node.next=newNode;
            node=newNode;
            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;
        }
        return re.next;
    }

    public static void main(String[] args) {
        ListNode re=new ListNode(0);
        ListNode node=re;
        for (int i=0;i<10;i++){
            ListNode newnode=new ListNode(i);
            node.next=newnode;
            node=newnode;
        }
        System.out.println(re.next);
    }
}
