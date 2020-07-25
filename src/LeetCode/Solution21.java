package LeetCode;

/**
 * @author colorful
 * @date 2020/7/11
 **/
//21. 合并两个有序链表
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode newList = new ListNode(0);
        ListNode cur = newList;
        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                cur.next = new ListNode(node1.val);
                cur = cur.next;
                node1 = node1.next;
            } else {
                cur.next = new ListNode(node2.val);
                cur = cur.next;
                node2 = node2.next;
            }
        }
        if (node1 == null) {
            cur.next = node2;
        } else {
            cur.next = node1;
        }
        return newList.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
