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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        

        int len = length(head);
        int count = len/k;

        while(count > 0) {
            ListNode last = prev;
            ListNode newEnd = curr;

            ListNode next = curr.next;
            for(int i = 0; curr != null && i < k; i++) {
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null) {
                    next = next.next;
                }
            }

            if(last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = curr;
            prev = newEnd;
            count--;
        }
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
