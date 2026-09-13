/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    public ListNode plusOne(ListNode head) {
        // rev the original ll
        head = reverseList(head);
        // add 1 to the ll
        ListNode curr = head;
        int carry = 1;
        while (curr != null) {
            int nodeValue = curr.val;
            int sum = nodeValue + carry;
            int digit = sum % 10;
            // insrt the digit into the curr
            curr.val = digit;
            // finf out whether there is smthg carry to pass or not
            carry = sum / 10;
            // move curr ko aage
            if (curr.next == null && carry > 0) {
                curr.next = new ListNode(carry);
                carry = 0;
            }
            curr = curr.next;
        }
        // reverse it again

        head = reverseList(head);

        // return the head of the modified ll
        return head;

    }
}