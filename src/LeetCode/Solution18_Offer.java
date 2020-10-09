package LeetCode;

/**
 * @author colorful
 * @date 2020/10/9
 **/
public class Solution18_Offer {
    public class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode deleteNode(ListNode head, int val) {
        if (head==null) return null;
        if (head.val==val) return head.next;
        head.next=deleteNode(head.next,val);
        return head;
    }

}
