public class removekthfromend {
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

        // Move curr n nodes ahead
        for (int i = 1; i <= n; i++) {
            curr = curr.next;
        }

        // If curr becomes null, we have to remove head
        if (curr == null) {
            return head.next;
        }

        // Move both pointers
        prev = head;

        while (curr.next != null) {
            curr = curr.next;
            prev = prev.next;
        }

        // Remove the Nth node
        prev.next = prev.next.next;

        return head;
    }
}
}
