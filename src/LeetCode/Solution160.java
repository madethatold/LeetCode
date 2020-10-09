package LeetCode;

import java.util.List;

/**
 * @author colorful
 * @date 2020/10/8
 **/
//160. 相交链表
public class Solution160 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null) return null;
        ListNode pA=headA;
        ListNode pB=headB;
        while (pA!=pB){
            pA=pA!=null?pA.next:headB;
            pB=pB!=null?pB.next:headA;
        }
        return pA;
    }
}
