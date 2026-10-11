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
    public ListNode[] splitListToParts(ListNode head, int k) {
       ListNode[] ans = new ListNode[k];
       //find out lenght of ll
       ListNode temp = head;
       int len =0;
       while(temp!=null){
            len++;
            temp=temp.next;
       }
       int basesize= (len/k);
       int extralen=(len%k);

       //main logic 

       ListNode prev =null;
       ListNode curr =head;

      for(int part=0; part<k; part++){

        //dimaag lagane wala point
        if(curr ==null){
            ans[part]=curr;
            continue;
        }
        //insert curr into arr
        ans[part]=curr;
     
        //find width of the curr sublist
       
int width = basesize;

if (extralen > 0) {
    width++;
    extralen--;
}
        
        for(int i =1; i<=width; i++){
    prev = curr;
    curr = curr.next;

        }
        prev.next=null;
        //now we will mpve to new itr
        prev =null;

       }
       return ans;
    }
}