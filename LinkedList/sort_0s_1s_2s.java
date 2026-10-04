public class sort_0s_1s_2s {

class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}


class Solution {
    public ListNode sortList(ListNode head) {
       ListNode temp = head;
       int zeroC =0;
       int oneC=0;
       int twoC=0;
       while (temp != null) {
            if(temp.data==0){
                zeroC++;
            }
            else if(temp.data==1){
                oneC++;
            }
            else{
                twoC++;
            }
            temp = temp.next;
        }
        ListNode trav =head;
        while(trav !=null){
            if(zeroC>0){
                trav.data=0;
                zeroC--;
            }
            else if(oneC>0){
                trav.data=1;
                oneC--;
            }
            else{
                trav.data=2;
                twoC--;

            }
            trav=trav.next;
        }
        return head;
    }
}
}
