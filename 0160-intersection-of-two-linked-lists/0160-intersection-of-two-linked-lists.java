/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        // Move both pointers together
        while (a != null && b != null) {
            a = a.next;
            b = b.next;
        }

        // B is longer
        if (a == null) {

            int bExtraLen = 0;

            while (b != null) {
                bExtraLen++;
                b = b.next;
            }

            // Move headB ahead
            while (bExtraLen-- > 0) {
                headB = headB.next;
            }

        } 
        // A is longer
        else {

            int aExtraLen = 0;

            while (a != null) {
                aExtraLen++;
                a = a.next;
            }

            // Move headA ahead
            while (aExtraLen-- > 0) {
                headA = headA.next;
            }
        }

        // Now both have equal remaining length
        while (headA != null && headB != null) {

            if (headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}