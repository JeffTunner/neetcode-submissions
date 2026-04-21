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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }

        ListNode mid = getMid(head);
        ListNode hf = head;
        ListNode hs = reverse(mid);

        while(hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        if(hf != null) {
            hf.next = null;
        }
    }

    private ListNode getMid(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while(f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    private ListNode reverse(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while(curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) {
                next = next.next;
            }
        }

        return prev;
    }
}