package LeetCode;

/**
 * @author colorful
 * @date 2020/10/9
 **/
//剑指 Offer 22. 链表中倒数第k个节点
public class Solution22_Offer {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p=head;
        ListNode cur=head;
        int len=0;
        while (p!=null){
            p=p.next;
            len++;
        }
        int lenK=len-k;
        for (int i=0;i<lenK;i++){
            cur=cur.next;
        }
        return cur;
    }
}
