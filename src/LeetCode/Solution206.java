package LeetCode;

/**
 * @author colorful
 * @date 2020/9/27
 **/
//206. 反转链表
public class Solution206 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
        return pre;
    }
}
