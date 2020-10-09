package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author colorful
 * @date 2020/10/5
 **/
//234. 回文链表
public class Solution234 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode fast=head;
        ListNode slow=head;
        while (fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if (fast.next!=null) slow=slow.next;
        ListNode node=reverse(slow);
        while (node!=null){
            if (node.val!=head.val) return false;
            head=head.next;
            node=node.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode res=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode newNode=cur.next;
            cur.next=res;
            res=cur;
            cur=newNode;
        }
        return res;
    }

}
