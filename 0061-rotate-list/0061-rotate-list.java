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
    public ListNode rotateRight(ListNode head, int k) {
        //step 1 , make it circular and find th elenght of ll
        if(head==null || k==0 ){
            return head;
        }
        int len =1;
        ListNode temp =head;
        while(temp.next!=null){
            len++;
            temp =temp.next;
        }
        //makeit circular
        temp.next=head;
        //k ko update krdo
         k = k % len;

    //step2: link break and set forward variable
    temp =  head;
    for(int i=1; i<len-k; i++){
        temp =temp.next;
    }
    ListNode forward =temp.next;
    //link break
    temp.next=null;

    //step 3 : retunr ht newHead of modified LL
    return forward;

    }
    
}