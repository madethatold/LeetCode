package LeetCode;

import java.util.List;

/**
 * @author colorful
 * @date 2020/9/24
 **/
//19. 删除链表的倒数第N个节点
public class Solution19 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode point=head;
        ListNode res=new ListNode(0);
        res.next=head;
        int len=0;
        while (point!=null){
            len++;
            point=point.next;
        }
        len=len-n;
        point=res;
        while (len>0){
            len--;
            point=point.next;
        }
        point.next=point.next.next;
        return res.next;
    }
}
