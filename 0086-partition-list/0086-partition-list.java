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
    public ListNode partition(ListNode head, int x) {
        ListNode greaterHead = new ListNode(-1);
        ListNode greaterTail= greaterHead;
        ListNode lesserHead = new ListNode(-1);
        ListNode lesserTail = lesserHead;
        
        ListNode temp = head;

        while(temp !=null){
            if(temp.val<x){
                //seprte this node and appedn to lesser wlai ll
                //also before doing this mak sure temp points to the head of the reamaining  list
                ListNode nodeToInsert = temp;
                temp = temp.next;
                nodeToInsert.next=null;
                //insert at tail --> less wali ll me
                lesserTail.next =nodeToInsert;
                lesserTail = nodeToInsert;
            }
            else{
                ListNode nodeToInsert = temp;
                temp = temp.next;
                nodeToInsert.next=null;
                //insert at tail --> greater  wali ll me
                greaterTail.next =nodeToInsert;
                greaterTail = nodeToInsert;

            }
        }
        //yaha par hmari dono sublist ready hia , noww the only things left is to join them 
        lesserTail.next =greaterHead.next;
        //rmv the dummy nodes (-1) wali 
        lesserHead=lesserHead.next;

        return lesserHead;
    }
}