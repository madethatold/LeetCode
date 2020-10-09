package LeetCode;

/**
 * @author colorful
 * @date 2020/9/28
 **/
//92. 反转链表 II
public class Solution92 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode pres = res;
        for (int i=1;i<m;i++){
            pres = pres.next;
        }
        ListNode pre=null;
        ListNode curr = pres.next;
        for (int i=0;i<=n-m;i++){
            ListNode node = curr.next;
            curr.next = pre;
            pre = curr;
            curr = node;
        }
        pres.next.next=curr;
        pres.next=pre;
        return res.next;
    }
}
