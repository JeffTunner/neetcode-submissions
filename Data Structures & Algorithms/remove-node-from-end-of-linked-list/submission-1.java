/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode prev = null;

        int len = length(head);
        int skip = len - n;

        if(skip == 0) {
            return head.next;
        }

        for(int i = 0; curr != null && i < skip; i++) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
        curr.next = null;

        return head;
    }

    private int length(ListNode head) {
        ListNode temp = head;
        int len = 0;

        while(temp != null) {
            len++;
            temp = temp.next;
        }

        return len;
    }
}
